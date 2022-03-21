import java.util.Scanner;
// Problem 45: Fibonacci
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class Fibonacci {
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
            long f0 = 0;
            long f1 = 1;
            for (int j = 1; j < N; j++)
            {
                long f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            System.out.println(N + " = " + f0);
        }
    }
}
