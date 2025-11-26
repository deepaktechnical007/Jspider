import java.util.Comparator;
import java.util.TreeSet;

class DescOrder implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2){
        return s2.compareTo(s1);
    }
}
 public class TreeSetDemo {

     public static void main(String[] args) {

         DescOrder d1 = new DescOrder();

         TreeSet<String> st1 = new TreeSet<>(d1);
         st1.add("C");
         st1.add("E");
         st1.add("A");
         st1.add("D");
         st1.add("B");

         for(String str: st1) {
             System.out.println(str);
         }
     }
}
