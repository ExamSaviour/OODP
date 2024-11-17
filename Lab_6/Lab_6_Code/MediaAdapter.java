
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class MediaAdapter implements MediaPlayer {

    public AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * @param audioType
     */
    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    /**
     * @param audioType 
     * @param fileName 
     * @return
     */
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}