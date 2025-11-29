package Collection.Map;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        System.out.println("Program start...");

        TreeMap<Integer,String> t1 = new TreeMap<>();

        t1.put(1,"a");
        t1.put(2,"b");
        t1.put(3,"c");
        System.out.println(t1.get(3));
        t1.put(3,"d");
        System.out.println(t1.get(3));
        t1.put(4,"a");

        System.out.println(t1);
        System.out.println(t1.get(30));

        System.out.println("Program end...");

    }
}
