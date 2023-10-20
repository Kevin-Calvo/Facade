package Tinder;

import java.util.List;
import java.util.ArrayList;

public class DatingAppFacade {
    private UserProfileSystem userProfileSystem;
    private MatchingSystem matchingSystem;
    private ChatSystem chatSystem;

    public DatingAppFacade() {
        this.userProfileSystem = new UserProfileSystem();
        this.matchingSystem = new MatchingSystem();
        this.chatSystem = new ChatSystem();
    }

    public UserProfile createProfile(String name, String bio, String photo) {
        return userProfileSystem.createProfile(name, bio, photo);
    }

    public List<UserProfile> findMatches(UserProfile user, UserProfile user2) {
        return matchingSystem.findMatches(user, user2); 
    }

    public void startChat(UserProfile user1, UserProfile user2) {
        chatSystem.initiateChat(user1, user2);
    }

    public void sendMessage(UserProfile user, String message) {
        chatSystem.sendMessage(user, message);
    }

    // Otras operaciones de la aplicación de citas
}

