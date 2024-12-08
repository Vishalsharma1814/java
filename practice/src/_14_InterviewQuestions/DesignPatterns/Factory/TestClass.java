package _14_InterviewQuestions.DesignPatterns.Factory;

public class TestClass {
    public static void main(String[] args) {
        FactoryDesign newAnimal = new FactoryDesign();
        Animal dog = newAnimal.createAnimal("dog");
        System.out.println(dog.sound());
        Animal cat = newAnimal.createAnimal("cat");
        System.out.println(cat.sound());
    }
}
