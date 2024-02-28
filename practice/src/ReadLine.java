import java.util.Scanner;

public class ReadLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a;
        System.out.println("Enter name: ");
        a=s.nextLine();
        System.out.println("Hi "+a);

    }
}
