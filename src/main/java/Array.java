import java.util.Arrays;

public class Array {
    int[] array;

    private static String newArray(int[] b) {
        return Arrays.toString(b);
    }

    static void iteratorOnArray(int[]){
        for (int i = 0; i < newArray(null).length(); i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(iteratorOnArray(newArray()));
    }
}

