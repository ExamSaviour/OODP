
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class AudioPlayer implements MediaPlayer {

    /**
     * 
     */
    public MediaAdapter mediaAdapter;

    /**
     * @param audioType 
     * @param fileName 
     * @return
     */
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. "+audioType+" format not supported");
        }
    }

}