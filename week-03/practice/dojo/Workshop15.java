import java.util.ArrayList;
import java.util.Arrays;

public class Workshop15 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]{3, 4, 5, 6, 7};
//        ah = reverseTheArray(ah);


        for (int i = 0; i < ah.length; i++) {
            System.out.print(ah[i]);
        }
        ;

//        create2dimArray(4);
//        create2dimArray(5);
        compareStrings("alma", "alma");

        String[] numbers = new String[]{"one", "two", "three", "four", "five"};

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(numbers));
        arrayList.addAll(Arrays.asList(numbers));


        Arrays.deepToString(numbers);
    }

    public static String deepToString(Integer[] array) {
        StringBuilder sb = new StringBuilder();
        for (Integer item : array) {
            sb.append(item.toString());
            sb.append(", ");
        }
        return sb.toString();
    }

    public static int[] solution1(int[] reversable) {
        int[] result = new int[reversable.length];
        for (int i = 0; i < reversable.length; i++) {
            result[i] = reversable[reversable.length - i - 1];
        }
        return result;
    }


    public static int[] solution2(int[] reversable) {
        int temp;
        for (int i = 0; i < reversable.length / 2; i++) {
            temp = reversable[i];
            reversable[i] = reversable[reversable.length - i - 1];
            reversable[reversable.length - i - 1] = temp;
        }
        return reversable;
    }

    public static int[][] solution3(int hossz) {
        int[][] result = new int[hossz][hossz];

        for (int i = 0; i < hossz; i++) {
            result[i][i] = 1;
        }

        return result;
    }

//    ---------------------
//    | alma
//    |   5    342    alma
//    |           5
//    | 1,2,3,4,5,6.....
//    ---------------------

    public static boolean compareStrings(String one, String two) {
        String temp = one;
        Integer a = new Integer(5);
        Integer b = new Integer(5);
        Integer c = a;
        int f = 5;
        char e;
        return new Integer(5) == f;
    }

}