import java.math.BigInteger;
import java.util.Scanner;
// Problem 139: Normal Math
// Author: Steve Brailsford, Marietta, Georgia, United States
// Originally Published: Code Quest 2021
// Difficulty: Medium
// Code Written By: Sam L.
public class NormalMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int M = sc.nextInt();
            int N = sc.nextInt();
            double sum = 0;
            for (int j = 0; j < M * N; j++)
            {
                double d = sc.nextDouble();
                sum += d * d;
            }
            System.out.printf("%.2f\n", Math.sqrt(sum));
        }
    }
}
