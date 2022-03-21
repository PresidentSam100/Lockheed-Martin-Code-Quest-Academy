import java.math.BigInteger;
import java.util.Scanner;
// Problem 2: Factorial!
// Difficulty: Easy
// Author: Vedant Patel, Stratford, Connecticut, United States
// Code Written By: Sam L.
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            BigInteger n = new BigInteger("1");
            while (N > 1)
            {
                n = n.multiply(new BigInteger("" + N));
                N--;
            }
            System.out.println(n.toString());
        }
    }
}
