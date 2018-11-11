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
        int[] arr = new int[value];
        String string = new String("");
        for (int i = 0; i < value; i++) {
            arr[i] = i + 1;
        }
        BigInteger bigInt = new BigInteger("1");
        BigInteger secBigInt = new BigInteger("1");
        BigInteger thirdBigInt = new BigInteger("1");
        for (int i = 0; i < value; i++) {
            bigInt = BigInteger.valueOf(1);
            secBigInt = BigInteger.valueOf(arr[i]);
            thirdBigInt = bigInt.multiply(secBigInt);
        }
        System.out.println(thirdBigInt);
        return thirdBigInt;
    }


    public static void main(String[] args) {

        factorial(5);

    }
}
