import java.util.*;

public class Workshop05{
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList(numbers));
        strings.get(0);



        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array

        Integer[] array = numList.toArray(new Integer[0]);


        int[][] multi = new int[4][4];
        System.out.println(multi[1]);

        int[] result = new int[numList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numList.get(i);
        }

        int j = 0;
        for (Integer num : numList) {
            result[j] = num;
            j++;
        }

        System.out.println();

        System.out.println(copy());
    }

    public static boolean copy() {
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));

        ArrayList<Integer> secondList = numList;
        int b = 4;
        int c = 4 + 1;
        secondList.remove(1);

        String q = "bela";


        //
        //  alma
        //  5
        //          alma
        // 1,2,3,4,5,6,7,....
        // a,b,c,d,e,...

        return false;
    }
}