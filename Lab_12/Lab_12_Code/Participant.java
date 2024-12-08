
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public abstract class Participant {

    /**
     * Default constructor
     */
    public Participant() {
    }

    /**
     * 
     */
    protected ChatRoom chatRoom;

    /**
     * 
     */
    protected String name;

    /**
     * @param chatRoom 
     * @param name
     */
    public Participant(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    /**
     * @param message 
     * @return
     */
    public abstract void sendMessage(String message);

    /**
     * @param message 
     * @return
     */
    public abstract void receiveMessage(String message);

}