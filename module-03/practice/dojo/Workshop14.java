import java.lang.reflect.Array;
import java.util.*;

public class Workshop14 {

    //  kutya
    //              macska
    // kuty
    //          macs
    //       kacs           rók
    public static void main(String... args){
//        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
//        // Add "a" to every string in al. Use a ListIterator!
//
//        ListIterator<String> iterator = al.listIterator();
//        while (iterator.hasNext()) {
//            String o = iterator.next();
//            iterator.set(o + "a");
//        }
//
//        for (int i = 0; i < al.size(); i++) {
//            al.set(i, al.get(i)+"a");
//        }
//
//        Iterator<String> iterator1 = al.iterator();
//        ArrayList<String> temp = new ArrayList<String>();
//
//        System.out.println(al);
//        String ae = "Misi";
//        System.out.println(greet(ae));

        String[][] colors = new String[3][];
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("lime", "forest green", "olive", "pale green", "spring green"));
        colors [1] = new String [] {"orange red", "red", "tomato"};
        colors [2] = new String [] {"orchid", "violet", "pink", "hot pink"};

        Object o;
        System.out.println(al);

//        for (String[] color : colors) {
//            System.out.println(color[0]);
//        }
    }

    public static String greet(String name) {
        return "Greetings my dear " + name;
    }
}