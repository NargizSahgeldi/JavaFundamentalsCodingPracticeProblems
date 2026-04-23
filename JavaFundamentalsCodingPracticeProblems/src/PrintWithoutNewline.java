import java.util.Scanner;

public class PrintWithoutNewline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String a = sc.next();

        System.out.println("Please enter a new word:");
        String b = sc.next();

        String c = a + " " + b;
        System.out.print(c);


    }
}
