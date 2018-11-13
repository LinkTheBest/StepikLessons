package vk.lincharageniy.com;


import java.math.BigInteger;

public class Main {

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger bigInt = BigInteger.ONE;
        for(int i = 1; i<=value; i++){
            bigInt = bigInt.multiply(BigInteger.valueOf(i));
        }

        return bigInt;
    }

    public static void main(String[] args) {

        factorial(10);

    }
}
