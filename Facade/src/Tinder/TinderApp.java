package Tinder;

import java.util.List;

public class TinderApp {
    public static void main(String[] args) {
        DatingAppFacade datingApp = new DatingAppFacade();

        // Crear un perfil de usuario
        UserProfile user1 = datingApp.createProfile("Alice", "Viajar", "photo1.jpg");
        UserProfile user2 = datingApp.createProfile("Bob", "Viajar", "photo2.jpg");

        // Encontrar coincidencias para un usuario
        List<UserProfile> matches = datingApp.findMatches(user1,user2); 

        // Iniciar un chat
        if (!matches.isEmpty()) { 
            UserProfile match = matches.get(0); // Supongamos que hemos encontrado una coincidencia
            datingApp.startChat(user1, user2);

            // Enviar un mensaje
            datingApp.sendMessage(user1, "Hola, ¿como estas?");
            datingApp.sendMessage(user2, "¡Hola! Estoy bien, ¿y tú?");
        }
        else
        	System.out.println("Usuario no tiene matches");
    }
}

