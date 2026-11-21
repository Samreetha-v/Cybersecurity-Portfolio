
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

import java.security.SecureRandom;
import java.util.Base64;

public class EncryptionDemo {

    public static void main(String[] args) throws Exception {

        // Original message
        String message = "Hello Sam";

        // Generate AES key
        KeyGenerator keyGenerator =
                KeyGenerator.getInstance("AES");

        keyGenerator.init(256);

        SecretKey secretKey = keyGenerator.generateKey();

        // Generate a random 12-byte IV
        byte[] iv = new byte[12];
        new SecureRandom().nextBytes(iv);

        // Encryption
        Cipher encryptCipher =
                Cipher.getInstance("AES/GCM/NoPadding");

        GCMParameterSpec spec =
                new GCMParameterSpec(128, iv);

        encryptCipher.init(
                Cipher.ENCRYPT_MODE, secretKey, spec);

        byte[] encrypted =
                encryptCipher.doFinal(message.getBytes());

        String encryptedText =
                Base64.getEncoder().encodeToString(encrypted);

        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encryptedText);

        // Decryption
        Cipher decryptCipher =
                Cipher.getInstance("AES/GCM/NoPadding");

        decryptCipher.init(
                Cipher.DECRYPT_MODE, secretKey, spec);

        byte[] decrypted =
                decryptCipher.doFinal(encrypted);

        String decryptedText = new String(decrypted);

        System.out.println("Decrypted: " + decryptedText);
    }
}
//o/p:Original: Hello Sam
Encrypted: [random encrypted text]
Decrypted: Hello Sam