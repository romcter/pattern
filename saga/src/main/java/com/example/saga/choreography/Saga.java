package com.example.saga.choreography;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Saga {
    private final List<Chapter> chapters;
    private int pos;
    private boolean forward;
    private boolean finished;

    public static Saga create() {
        return new Saga();
    }

    public SagaResult getResult() {
        if (finished) {
            return forward ? SagaResult.FINISHED : SagaResult.ROLLEDBACK;
        }
        return SagaResult.PROGRESS;
    }

    public Saga chapter(String name) {
        this.chapters.add(new Chapter(name));
        return this;
    }

    public Saga setInValue(Object value) {
        if (chapters.isEmpty()) {
            return this;
        }
        chapters.get(chapters.size() - 1).setInValue(value);
        return this;
    }

    public Object getCurrentValue() {
        return chapters.get(pos).getIntValue();
    }

    public void setCurrentValue(Object value) {
        chapters.get(pos).setInValue(value);
    }

    public void setCurrentStatus(ChapterResult result) {
        chapters.get(pos).setResult(result);
    }

    void setFinished(boolean finished) {
        this.finished = finished;
    }

    boolean isForward() {
        return forward;
    }

    int forward() {
        return ++pos;
    }

    int back() {
        this.forward = false;
        return --pos;
    }

    private Saga() {
        this.chapters = new ArrayList<>();
        this.pos = 0;
        this.forward = true;
        this.finished = false;
    }

    Chapter getCurrent() {
        return chapters.get(pos);
    }

    boolean isPresent() {
        return pos >= 0 && pos < chapters.size();
    }

    boolean isCurrentSuccess() {
        return chapters.get(pos).isSuccess();
    }

    @Override
    public String toString() {
        return "Saga{" +
                "chapters=" + Arrays.toString(chapters.toArray()) +
                ", pos=" + pos +
                ", forward=" + forward +
                ", finished=" + finished +
                '}';
    }
}
