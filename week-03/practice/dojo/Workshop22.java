public class Workshop22{
    public static void main(String[] args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)

        System.out.println();
        paramPrinter(5, "alma", "korte");
    }

    public static void paramPrinter(int y, String... x) {
        for (String s : x) {
            System.out.println(s + y);
        }
    }
}