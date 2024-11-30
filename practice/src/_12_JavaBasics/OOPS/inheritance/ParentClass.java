package _12_JavaBasics.OOPS.inheritance;

public abstract class ParentClass {
    abstract void callFromChild(String input);

    void callFromParent(String input) {
        System.out.println(input);
    }
}
