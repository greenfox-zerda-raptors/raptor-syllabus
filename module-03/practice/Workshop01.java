/**
 * Created by aze on 2016.10.31..
 */

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

public class Workshop01 {
    static int b;
    public static void main(String[] args) {
        String s = "asjdghashdgaj";
        System.out.println("Hello World!");



        int a = 0;

        if(something)
            a = 5;
        else
            a = 10;

        int a = something ? 5 : 10;


        int[] bla = new int[]{324,-2,273,4123,2145};

        for (int i = 0; i < bla.length; i++)
            System.out.println(bla[i]);

        for (int itemFromBla : bla) {
            System.out.println(itemFromBla);
        }


    }

    public static int randomNumber(float from, int to) {
        return 4;
    }

    public static void fizzBuzz(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.println(createAFizzBuzzFromANumber(i));
        }
    }

    public static void reverseFizzBuzz(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(createAFizzBuzzFromANumber(i));
        }
    }

    public static String createAFizzBuzzFromANumber(int i) {
        String s = "";
        s += i % 3 == 0 ? "Fizz" : "";
        s += i % 5 == 0 ? "Buzz" : "";
        s += s.length() == 0 ? i : "";
        return s;
    }
}
