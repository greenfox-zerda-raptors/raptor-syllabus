public class Workshop21{
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(factorial(25));
        System.out.println(factorialV2(25));
        System.out.println(fibo(8));

    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialV2(int number) {
        return number == 1 ? 1 : factorialV2(number - 1) * number;
    }

    public static int fibo(int number) {
        if (number < 3) {
            return 1;
        }
        return fibo(number - 1) + fibo(number - 2);
    }

}