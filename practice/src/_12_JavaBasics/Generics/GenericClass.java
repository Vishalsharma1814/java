package _12_JavaBasics.Generics;

public class GenericClass <T>{
    private T data;
    public GenericClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
