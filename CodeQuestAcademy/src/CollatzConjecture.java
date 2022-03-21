import java.util.Scanner;
// Problem 74: Collatz Conjecture
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            int n = N;
            int len = 1;
            while (N != 1)
            {
                len++;
                if (N % 2 == 0)
                {
                    N /= 2;
                }
                else
                {
                    N *= 3;
                    N++;
                }
            }
            System.out.println(n + ":" + len);
        }
    }
}
