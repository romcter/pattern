package adapter;

public class FacebookAdapter extends Facebook implements SocialNetwork {

    @Override
    public void addFriend() {
        addFriendInFacebook();
    }

    @Override
    public void removeFriend() {
        deleteFriendInFacebook();
    }

    @Override
    public void addPhoto() {
        addPhotoInFacebook();
    }

    @Override
    public void removePhoto() {
        deletePhotoInFacebook();
    }
}
