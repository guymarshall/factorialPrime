import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static int saveInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int number = saveInput("Enter number to calculate factorial of:");

        Factorial oFactorial = new Factorial();
        BigInteger factorial = oFactorial.calculateFactorial(number);

        Prime oPrime = new Prime();
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