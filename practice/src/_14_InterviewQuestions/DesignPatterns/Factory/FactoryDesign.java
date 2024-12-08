package _14_InterviewQuestions.DesignPatterns.Factory;

public class FactoryDesign {
    public static Animal createAnimal(String type){
        if(type.equalsIgnoreCase("dog")){
            return new Dog();
        }else if(type.equalsIgnoreCase("cat")){
            return new Cat();
        }
        return null;
    }
}
