import java.util.Scanner;
// Problem 11: Monogram
// Difficulty: Easy
// Originally Published: Code Quest 2015
// Code Written By: Sam L.
public class Monogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            for (int j = 0; j < N; j++)
            {
                String a = sc.next().substring(0, 1);
                String b = sc.next().substring(0, 1);
                String c = sc.next().substring(0, 1);
                System.out.println((a + c + b).toUpperCase());
            }
        }
    }
}
