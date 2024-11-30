package _12_JavaBasics.OOPS.inheritance;

public class ChildClass2 {
    public static void main(String[] args) {
        ChildInterface i = (String l, String j) ->{
            System.out.println(l+" "+ j);
        };
        i.callInterfaceMethod("Vishal", "Sharma");
    }
}
