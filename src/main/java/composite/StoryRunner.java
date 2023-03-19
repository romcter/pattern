package composite;

import java.util.List;

public class StoryRunner {
    public static void main(String[] args) {
        Story story = new Discussion(
                List.of(
                        new BaseStory(),
                        new RandomStory(),
                        new RecallStory())
        );
        story.sayStory();
    }
}
