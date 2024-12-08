
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class ConcreteParticipant extends Participant {

    /**
     * Default constructor
     */
    public ConcreteParticipant() {
    }

    /**
     * @param chatRoom 
     * @param name
     */
    public ConcreteParticipant(ChatRoom chatRoom, String name) {
        super(chatRoom, name);
    }

    /**
     * @param message 
     * @return
     */
    public void sendMessage(String message) {
        // TODO implement here
        System.out.println(this.name + " sends: " + message);
        chatRoom.sendMessage(message, this);
    }

    /**
     * @param message 
     * @return
     */
    public void receiveMessage(String message) {
        // TODO implement here
        System.out.println(this.name + " received: " + message);
    }

}