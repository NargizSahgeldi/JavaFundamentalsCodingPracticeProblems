import java.util.Scanner;

public class ConcatenateIntegers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = concat(a, b);
        System.out.println(res);
    }

    public static int concat(int a, int b) {
        return Integer.parseInt("" + a + b);
    }
}
