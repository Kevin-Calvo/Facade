package Tinder;

import java.util.List;
import java.util.ArrayList;

public class UserProfileSystem {
    public UserProfile createProfile(String name, String bio, String photo) {
    	System.out.println("Perfil de "+name+"creado");
        // Lógica para crear un perfil de usuario
        return new UserProfile(name, bio, photo);
    }

    public void updateProfile(UserProfile profile, String newBio) {
        // Lógica para actualizar el perfil de usuario
        profile.setBio(newBio);
    }

    // Otras operaciones relacionadas con perfiles
} 
 
