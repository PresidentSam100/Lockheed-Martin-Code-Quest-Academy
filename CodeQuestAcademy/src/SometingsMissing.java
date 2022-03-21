import java.util.Scanner;
// Problem 43: Someting's Missing
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class SometingsMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            int N = sc.nextInt();
            System.out.println(s.substring(0, N) + s.substring(N + 1));
        }
    }
}
