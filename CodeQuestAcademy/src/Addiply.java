import java.util.Scanner;
// Problem 44: Addiply
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class Addiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a+b) + " " + (a*b));
        }
    }
}
