package Tinder;

public class ChatSystem {
    public void initiateChat(UserProfile user1, UserProfile user2) {
    	System.out.println("Chat iniciado entre: " + user1.name + " y "+ user2.name ); 
        // Lógica para iniciar un chat entre dos usuarios
    }

    public void sendMessage(UserProfile user, String message) {
        // Lógica para enviar un mensaje en el chat
    	System.out.println(user.name + ":  " + message); 
    }

    // Otras operaciones relacionadas con el chat
}

