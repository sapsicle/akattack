/**
 * Helper methods for high level actions
 */
public class Helper {
    /**
     * Pauses program for specified interval in ms
     * @param ms Milliseconds to pause
     */
    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}