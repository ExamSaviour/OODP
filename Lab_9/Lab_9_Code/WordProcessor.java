
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class WordProcessor extends DocumentProcessor {

    /**
     * Default constructor
     */
    public WordProcessor() {
    }

    /**
     * @return
     */
    protected void openDocument() {
        // TODO implement here
        System.out.println("Opening Word document...");
    }

    /**
     * @return
     */
    protected void processContent() {
        // TODO implement here
        System.out.println("Processing Word document content...");
    }

    /**
     * @return
     */
    protected void saveDocument() {
        // TODO implement here
        System.out.println("Saving Word document...");
    }

    /**
     * @return
     */
    protected void closeDocument() {
        // TODO implement here
        System.out.println("Closing Word document...");
    }
}