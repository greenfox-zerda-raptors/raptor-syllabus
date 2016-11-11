import java.util.*;

public class Workshop06 {
    public static void main(String... args){
        ArrayList<String> listacska = new ArrayList<String>();
        listacska.add("1");
        listacska.add("2");
        listacska.add("3");
        listacska.add("3");
        listacska.add("4");
        listacska.add("4");
        listacska.add("4");
        listacska.add("5");
        listacska.add("5");
        listacska.add("5");
        listacska.add("5");
        listacska.add("6");
        listacska.add("7");
        listacska.add("7");
        // Accidentally we added number 3 twice. Your task is to remove it from the list
        egyediesito(listacska);
        System.out.println(listacska);
    }

    // 1,2,3,4,1,2,2,3.2,4,5
    public static void egyediesito(ArrayList listacska) {
        Collections.sort(listacska);
        for (int y = 0; y < listacska.size(); y++) {
            for (int i = y + 1; i < listacska.size();) {
                if (listacska.get(i) == listacska.get(y)) {
                    listacska.remove(y);
                } else {
                    i++;
                }

            }
        }
    }

    public static void uniq(ArrayList list) {
        for (Object o : list) {

        }
    }
}