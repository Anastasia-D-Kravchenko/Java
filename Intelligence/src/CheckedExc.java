class MyUncheckedException extends IllegalArgumentException {
    MyUncheckedException() {super();}
    MyUncheckedException(String message) {super(message);}
}
public class CheckedExc {
    public static void main(String[] args) {

        try {
            goSleep(5 * 1000);
        } catch (InterruptedException ignored) {
            System.err.println("Interrupted");
        } finally {
            System.err.println("AFTER SLEEP");
        }

        try {
            goSleep(-1);
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        } catch (Exception e) {
            System.err.println("Handling exception: " + e.getMessage());
        } finally {
            System.err.println("GOING ON");
            // here MyUncheckedException is not handled
            // so the program will crash (but 'finally'
            // clause will be executed anyway)
        }

        try {
            goSleep(-1);
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        } finally {
            System.err.println("QUITTING");
        }
    }

    private static void goSleep(int time) throws InterruptedException {
        if (time < 0) throw new MyUncheckedException("Negative time");

        System.out.println("Going to sleep for " + time + "ms");
        Thread.sleep(time);
        System.out.println("Waking up");
    }
}