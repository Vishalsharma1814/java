package _12_JavaBasics.OOPS.inheritance;

public class ChildClass extends ParentClass{
    @Override
    void callFromChild(String input) {
        System.out.println(input);
    }
}
