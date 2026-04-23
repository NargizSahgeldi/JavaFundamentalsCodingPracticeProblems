import java.util.Scanner;

public class PrintWithoutSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        PrintWithoutSpace obj = new PrintWithoutSpace();
        obj.concatandPrint(a, b);
    }

    public void concatandPrint(String a, String b) {
        System.out.println(a + b);

    }
}
