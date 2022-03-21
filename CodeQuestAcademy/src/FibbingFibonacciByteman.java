import java.util.Scanner;
// Problem 5: Fibbing Fibonacci, Byteman!
// Difficulty: Easy
// Author: Joe Worsham, Colorado Springs, Colorado, United States
// Code Written By: Sam L.
public class FibbingFibonacciByteman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            if (N == 0)
            {
                System.out.println("TRUE");
                continue;
            }
            int f0 = 0;
            int f1 = 1;
            while (f1 < N)
            {
                int f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            if (f1 == N)
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        }
    }
}
