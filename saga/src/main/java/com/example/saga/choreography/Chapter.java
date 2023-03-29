package com.example.saga.choreography;

public class Chapter {
    private final String name;
    private ChapterResult result;
    private Object inValue;

    public Chapter(String name) {
        this.name = name;
        this.result = ChapterResult.INIT;
    }

    public Object getIntValue(){
        return inValue;
    }

    public void setInValue(Object object){
        this.inValue = object;
    }

    public String getName(){
        return name;
    }

    public void setResult(ChapterResult result){
        this.result = result;
    }

    public boolean isSuccess(){
        return  result == ChapterResult.SUCCESS;
    }
}
