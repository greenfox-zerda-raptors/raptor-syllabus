import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by aze on 2016.11.11..
 */
public class Workshop18 {

    public static void main(String[] args) {

        BufferedReader br = null, br2 = null;
        try {
            br = new BufferedReader(new FileReader("file.txt"));
            br2 = new BufferedReader(new FileReader("file2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line1 = br.readLine();
            String line2 = br2.readLine();
            boolean end = false;
            while (line1 != null || line2 != null) {
                if (line1 == null) {
                    System.out.println(line2);
                    line2 = br2.readLine();
                } else if (line2 == null) {
                    System.out.println(line1);
                    line1 = br.readLine();
                } else {
                    int a = Integer.parseInt(line1);
                    int b = Integer.parseInt(line2);

                    if (a < b) {
                        System.out.println(a);
                        line1 = br.readLine();
                    } else {
                        System.out.println(b);
                        line2 = br2.readLine();
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                br2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
