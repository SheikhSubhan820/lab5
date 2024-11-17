package lab5bb;

import java.util.Random;

public class AlphabetPrinter {

    public static void main(String[] args) {
        // Start a thread to print random alphabets A-Z with fluctuating visualization
        AlphabetThread alphabetThread = new AlphabetThread();
        Thread thread = new Thread(alphabetThread);
        thread.start();
    }
}
