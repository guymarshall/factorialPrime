import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;


public class Prime {
    public boolean isPrimeNumber(int number) {
        int ceilingRoot = (int)ceil(sqrt(number));
        if (ceilingRoot >= number) {
            ceilingRoot = number - 1;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= ceilingRoot; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}