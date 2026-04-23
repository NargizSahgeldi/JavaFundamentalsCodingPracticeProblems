import java.util.Scanner;

public class PrintWithSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWithSeparator obj = new PrintWithSeparator();
        obj.utility(sc);
    }

    public void utility(Scanner sc) {
        String a = sc.next();
        String sep = sc.next();
        String b = sc.next();

        System.out.println(a + sep + b);
    }
}
