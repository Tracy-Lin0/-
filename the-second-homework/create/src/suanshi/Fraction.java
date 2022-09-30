package suanshi;
import java.math.*;
public class Fraction {
        public static int[] toFractionPos(double x){
        String[] parts = Double.toString(x).split("\\.");
        double den = Math.pow(10, parts[1].length()); //denominator
        double num = Double.parseDouble(parts[0]) * den + Double.parseDouble(parts[1]); //numerator
        return reduceFraction((int)num, (int)den);
    }
    public static int[] reduceFraction(int num, int den){
        int gcd = BigInteger.valueOf(num).gcd(BigInteger.valueOf(den)).intValue(); // greatest
        // common
        // divisor
        int[] rf = { num / gcd, den / gcd };
        return rf;
    }
}