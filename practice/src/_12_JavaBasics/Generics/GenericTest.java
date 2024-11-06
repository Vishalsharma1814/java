package _12_JavaBasics.Generics;

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>("Hello From Vishal");
        System.out.println(genericClass.getData());
        GenericClass<Integer> genericClass1 = new GenericClass<>(10);
        System.out.println(genericClass1.getData());

        BoundedGenericClass<String> genericClass2 = new BoundedGenericClass<>("This generic class can only take String as datatype for variable data");
        System.out.println(genericClass2.getData());
    }

}
