
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public abstract class DocumentProcessor {

    /**
     * Default constructor
     */
    public DocumentProcessor() {

    }

    /**
     * @return
     */
    protected abstract void openDocument();

    /**
     * @return
     */
    protected abstract void processContent();

    /**
     * @return
     */
    protected abstract void saveDocument();

    /**
     * @return
     */
    protected abstract void closeDocument();

    /**
     * @return
     */
    public final void processDocument() {
        // TODO implement here
        openDocument();
        processContent();
        saveDocument();
        closeDocument();
    }

}