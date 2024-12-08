
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class ChatRoom {

    /**
     * Default constructor
     */
    public ChatRoom() {
        participants = new ArrayList<>();
    }

    /**
     * 
     */
    private List<Participant> participants;

    /**
     * @param participant 
     * @return
     */
    public void addParticipant(Participant participant) {
        // TODO implement here
        participants.add(participant);
    }

    /**
     * @param message 
     * @param sender 
     * @return
     */
    public void sendMessage(String message, Participant sender) {
        // TODO implement here
        for (Participant participant : participants) {
            if (participant != sender) {
                participant.receiveMessage(message);
            }
        }
    }

}