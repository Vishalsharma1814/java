public class Variables {
    public static void main(String[] args) {
        //Primitives cannot be assigned a null value,
        // which can be problematic in certain situations.
        // Wrapper classes can be set to null,
        // allowing for more flexibility in handling cases where a value might be absent
        byte b = 10; // -128 to 127 is allowed
        float f = 45.7f;
        char c = 'C';
        System.out.println(b+" "+f+" "+c);
        
    }
}
