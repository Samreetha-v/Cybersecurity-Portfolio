
import java.security.MessageDigest;

public class HashingDemo {

    public static void main(String[] args) throws Exception {

        String message = "Hello Sam";

        // Create SHA-256 MessageDigest
        MessageDigest digest =
                MessageDigest.getInstance("SHA-256");

        // Generate hash
        byte[] hashBytes =
                digest.digest(message.getBytes());

        // Convert bytes into hexadecimal
        StringBuilder hashValue = new StringBuilder();

        for (byte b : hashBytes) {

            hashValue.append(
                    String.format("%02x", b & 0xff)
            );
        }

        System.out.println("Original: " + message);
        System.out.println("SHA-256 Hash: " + hashValue);
    }
}
//o/p:Original: Hello Sam

SHA-256 Hash:
[64 hexadecimal characters]