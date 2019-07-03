import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) throws Exception {
        String data = "What's up1";
        String algorithm1 = "SHA-256";
        String algorithm2 = "MD5";
        String algorithm3 = "SHA-512";
        String algorithm4 = "SHA-1";
        byte[] salt = createSalt();
        System.out.println("SHA-256 hash: " + generateHash(data, algorithm1, salt));
        System.out.println("MD5 hash: " + generateHash(data, algorithm2, salt));
        System.out.println("SHA-512 hash: " + generateHash(data, algorithm3, salt));
        System.out.println("SHA-1 hash: " + generateHash(data, algorithm4, salt));
    }

    private static byte[] createSalt() {
        byte[] bytes = new byte[20];
        SecureRandom random = new SecureRandom();
        random.nextBytes(bytes);
        return bytes;
    }

    private static String generateHash(String data, String algorithm, byte[] salt) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(algorithm);
        digest.reset();
        digest.update(salt);
        byte[] hash = digest.digest(data.getBytes());
        return bytesToStringHex(hash);
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    private static String bytesToStringHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}