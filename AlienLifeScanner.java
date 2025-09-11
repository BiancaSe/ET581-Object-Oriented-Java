public class AlienLifeScanner {
    public static void main(String[] args) {
        int scanAttempt = 1;
        boolean signalDetected = false;

        while (!signalDetected && scanAttempt <= 10) {
            System.out.println("Scanning attempt #" + scanAttempt + "...");

            // Simulate detecting a signal on the 7th attempt
            if (scanAttempt == 7) {
                signalDetected = true;
                System.out.println("👽 Alien signal detected on attempt #" + scanAttempt + "!");
            } else {
                System.out.println("No signal detected. Retrying...");
            }

            scanAttempt++;
        }

        if (!signalDetected) {
            System.out.println("🔭 All scans complete. No alien life found.");
        }
    }
}
