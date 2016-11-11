import java.util.Random;

/**
 * Created by aze on 2016.11.08..
 */
public class Pelda {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int random = r.nextInt(20);
            System.out.println(random);
        }
    }
}
