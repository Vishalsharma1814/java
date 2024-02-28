import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a ,b, c;
        System.out.println("Enter no: ");
        a=s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Output: "+c);

    }
}