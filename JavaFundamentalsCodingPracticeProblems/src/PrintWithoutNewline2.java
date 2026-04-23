import java.util.Scanner;

public class PrintWithoutNewline2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWithoutNewline2 obj = new PrintWithoutNewline2();
        obj.utility(sc);
    }
    public void utility(Scanner sc) {
        String a = sc.next();
        String b = sc.next();

        System.out.print(a + " " + b);
    }
}
