import java.math.BigInteger;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;


public class Prime {
    public boolean isPrimeNumber(BigInteger number) {
        BigInteger ceilingRoot = number.sqrt();
//        int ceilingRoot = (int)ceil(sqrt(number));
//        if (ceilingRoot >= number) {
//            ceilingRoot = number - 1;
//        }
        if (ceilingRoot.compareTo(number) >= 0) {
            ceilingRoot = number.subtract(BigInteger.ONE);
        }

//        if (number % 2 == 0) {
//            return false;
//        }

        if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return false;
        }

//        for (int i = 3; i <= ceilingRoot; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }

        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(ceilingRoot) >= 0; i = i.add(BigInteger.TWO)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }
}