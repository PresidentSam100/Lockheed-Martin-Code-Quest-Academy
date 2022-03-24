import java.util.Scanner;
// Problem 66: Positive/Negative
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            if (N > 0)
                System.out.println("POSITIVE");
            else if (N < 0)
                System.out.println("NEGATIVE");
        }
    }
}
