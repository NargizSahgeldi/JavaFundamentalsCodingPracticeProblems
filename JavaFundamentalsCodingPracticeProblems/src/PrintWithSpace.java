import java.util.Scanner;

public class PrintWithSpace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PrintWithSpace obj = new PrintWithSpace();
        obj.utility(sc);

    }

    public void utility(Scanner sc){
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a + " " + b);

    }
}
