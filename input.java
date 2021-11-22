import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String str = "ahalai";
        String c = new String("asdasd");
        Scanner s = new Scanner(System.in);
        System.out.println("input smthing:");
        String string = s.nextLine();
        System.out.println("your input " + string);
        System.out.println("input smthing:");
        int x = s.nextInt();
        System.out.println("your input " + x);
    }
}
