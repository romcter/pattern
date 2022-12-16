package adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new FacebookAdapter();

        socialNetwork.addFriend();
        socialNetwork.addPhoto();
        socialNetwork.removeFriend();
        socialNetwork.removePhoto();
    }
}
