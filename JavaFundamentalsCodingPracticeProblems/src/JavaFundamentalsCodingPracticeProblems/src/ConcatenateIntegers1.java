import java.util.Scanner;

public class ConcatenateIntegers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        concat(a, b);
    }

    public static void concat(int a, int b) {
        String res = "" + a + b;
        System.out.printf(res);

    }
}
