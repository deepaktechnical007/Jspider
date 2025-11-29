package Collection.Map;

import java.util.HashMap;

public class HashMapDemo1 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        HashMap<Integer,String> h1 = new HashMap<>();

        h1.put(1,"a");
        h1.put(2,"b");
        h1.put(3,"c");
        System.out.println(h1.get(3));
        h1.put(3,"d");
        System.out.println(h1.get(3));
        h1.put(4,"a");

        System.out.println(h1);
        System.out.println(h1.get(30));

        System.out.println("Program end...");
    }
}
