public class Test {
    public static void main(String[] args) {
        String s = "My name is Vishal Sharma";
        String[] s2 = s.split(" ");

        StringBuffer result = new StringBuffer();
        for (String one: s2
             ) {
            StringBuffer local = new StringBuffer(one).reverse();
            result.append(local).append(" ");
        }
        System.out.println(result);
    }
}