public class EncryptDecrypt {
    public static void encrypt(String pass) {
        char temp;
        for (int i = 0; i < pass.length(); i++) {
            temp = pass.charAt(i);
            temp *= 2;
            System.out.print(temp);
        }

    }

    public static void decrypt(String pass) {
        char temp;
        for (int i = 0; i < pass.length(); i++) {
            temp = pass.charAt(i);
            temp /= 2;
            System.out.print(temp);
        }

    }

    public static void main(String[] args) {
        encrypt("SomeSuperStrong Password");

        System.out.println();
        decrypt("¦ÞÚÊ¦êàÊä¦èäÞÜÎ@ ÂææîÞäÈ");
    }
}
