import java.util.*;

public class Workshop16 {
    public static void main(String... args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 10, 6, 7 ));
        // Fix this code fragment! It should remove every even number from the list.

        // Why is this bad???? HAAAGAHAHAHAHAAHAHHAHA
        for (int i = 0; i < al.size(); i++) {
            int element = al.get(i);
            if(element % 2 == 0) {
                al.remove(element);
            }
        }

        // Why is this bad again????? HAhahahahahHAHAHHDASHDAHF
        for (int i = 0; i < al.size(); i++) {
            Integer element = al.get(i);

            if(element % 2 == 0){
                al.remove(element);
            }
        }

        System.out.println(al);

//        for(int element : al){
//            if(element % 2 == 0){
//                al.remove(element);
//            }
//        }
        al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        Iterator iterator = al.iterator();

        while (iterator.hasNext()) {
            int element = (Integer)iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(al);
    }
}