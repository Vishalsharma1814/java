package _12_JavaBasics.Generics;

public class BoundedGenericClass <T extends String>{
    private T data;
    public BoundedGenericClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
