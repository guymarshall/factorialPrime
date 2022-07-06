import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Factorial oFactorial = new Factorial();
    static Prime oPrime = new Prime();
    public static int saveInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int number = saveInput("Enter number to calculate factorial of:");

        BigInteger factorial = oFactorial.calculateFactorial(number);

        while (true) {
            boolean isPrime = oPrime.isPrimeNumber(factorial);
            if (isPrime) {
                break;
            }
            factorial = factorial.add(BigInteger.ONE);
        }

//        System.out.printf("%.3E%n", factorial);
        System.out.println(factorial);
    }
}