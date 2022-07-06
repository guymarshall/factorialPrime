import java.math.BigInteger;

public class Factorial {
    public BigInteger calculateFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        BigInteger counter = BigInteger.TWO;
        BigInteger userInput = new BigInteger(Integer.toString(number));

        if (number > 1) {
            while (counter.compareTo(userInput) < 1) { // counter <= number
                result = result.multiply(counter);
                counter = counter.add(BigInteger.ONE);
            }
        }
        return result;
    }
}