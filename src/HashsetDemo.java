import java.util.LinkedHashSet;

public class HashsetDemo {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        LinkedHashSet<String> hs1 = new LinkedHashSet();

            hs1.add("Java");
            hs1.add("Pythen");
            hs1.add("javaScript");
            hs1.add("Html");
            hs1.add(null);
            hs1.add("Java");

            for(String str : hs1){

                System.out.println(str);
            }

        System.out.println("Program end...");
    }
}
