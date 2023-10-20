package Tinder;

public class UserProfile {
    String name;
    String bio; 
    String photo;

    public UserProfile(String name, String bio, String photo) {
        this.name = name;
        this.bio = bio;
        this.photo = photo;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    // Getters y setters
}

