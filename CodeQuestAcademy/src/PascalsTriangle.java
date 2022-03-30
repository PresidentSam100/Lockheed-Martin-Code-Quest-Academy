import java.math.BigInteger;
import java.util.Scanner;
// Problem 125: Pascal's Triangle
// Author: Ryan Regensburger, Huntsville, Alabama, United States
// Originally Published: Code Quest Australia 2019
// Difficulty: Medium
// Code Written By: Sam L.
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            if (N <= 1)
                System.out.println(1);
            else
                System.out.println(combo(N, N / 2));
        }
    }

    public static BigInteger combo(int n, int k)
    {
        return factorial(n).divide(factorial(k)).divide(factorial(n - k));
    }

    public static BigInteger factorial(int num)
    {
        BigInteger ans = new BigInteger("" + num);
        for (int i = 2; i < num; i++)
        {
            ans = ans.multiply(new BigInteger("" + i));
        }
        return ans;
    }
}
