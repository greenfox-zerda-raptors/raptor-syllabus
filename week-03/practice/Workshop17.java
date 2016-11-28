import java.io.*;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by aze on 2016.11.11..
 */
public class Workshop17 {
    public static String basePath = "/home/aze/greenfox/";
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("dear user, enter a file name, assuming we're in " + basePath);
            File source = loadFile(scanner);
            if (source == null) {
                return; // End of program, because User said "blank" for file name
            }
            System.out.println("dear user, enter a destination file name, assuming the same path: " + basePath);
            String fileNameDestination = scanner.next();
            System.out.println("We're copying from" + source.getPath() + " to " + basePath + fileNameDestination +
                                ", confirm with a Y or N to abort.");
            File destination = new File(basePath + fileNameDestination);
            if (!destination.exists()) {
                destination.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(source));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
            String line = reader.readLine();
            int length = line.length();
            while (line != null) {

                writer.write(line);
                line = reader.readLine();
                if (line != null) {
                    writer.newLine();
                    length += line.length() + 1;
                }
            }

            reader.close();
            writer.close();
            scanner.close();
            System.out.println("We're done.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static File loadFile(Scanner scanner) {
        String filenameSource = scanner.next();
        if (filenameSource.equals("")) {
            return null;
        }
        File source = new File(basePath + filenameSource);
        if (source.exists()) {
            return source;
        } else {
            System.out.println("sorry, this file doesnt exist, try again, or blank to exit");
            return loadFile(scanner);
        }
    }
}
