package lab5bb;

import java.util.Random;

class AlphabetThread implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        
        // Loop to print 26 random characters
        for (int i = 0; i < 26; i++) {
            // Generate a random character between A and Z
            char randomChar = (char) ('A' + random.nextInt(26));
            
            // Print the random character
            System.out.print(randomChar + " ");
            
            // Fluctuate visualization by using Thread.sleep() with random delay
            try {
                // Generate a random sleep time between 100ms and 500ms
                int randomDelay = 100 + random.nextInt(400);
                Thread.sleep(randomDelay); // Sleep to create a fluctuation effect
            } catch (InterruptedException e) {
                // Handle the interruption if the thread is stopped
                Thread.currentThread().interrupt();
            }
            
            // Stop the thread after a few iterations for demonstration purposes
            if (i == 10) { // Stop the thread after printing 10 characters
                System.out.println("\nStopping the thread now...");
                Thread.currentThread().stop();  // Deprecated stop() call
                break;
            }
        }
        
        // Ensure the last character is printed in the same line
        System.out.println();
    }
}