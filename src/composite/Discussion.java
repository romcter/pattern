package composite;

import java.util.List;

public class Discussion implements Story {

    private List<Story> storys;

    public Discussion(List<Story> storys) {
        this.storys = storys;
    }


    @Override
    public void sayStory() {
        System.out.println("Start discussion ------------------");

        for (Story story: storys) {
            story.sayStory();
        }
    }
}
