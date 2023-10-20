package Tinder;

import java.util.List;
import java.util.ArrayList;

public class MatchingSystem {
    public List<UserProfile> findMatches(UserProfile user, UserProfile user2) {
    	ArrayList<UserProfile> matches = new ArrayList<UserProfile>();  
    	if (user.bio == user2.bio) 
    	{
    		System.out.println("Match entre: "+user.name + " y "+user2.name); 
    		matches.add(user2); 
    	}
        // Lógica para encontrar coincidencias basadas en preferencias de usuario
        // Devuelve una lista de perfiles que son coincidencias
        return matches;
    }

    // Otras operaciones relacionadas con coincidencias
}
