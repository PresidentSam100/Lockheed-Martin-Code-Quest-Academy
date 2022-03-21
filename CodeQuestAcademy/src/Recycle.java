import java.util.Scanner;
// Problem 1: Recycle!
// Difficulty: Easy
// Author: Karen Tran, Palmdale, California, United States
// Code Written By: Sam L.
public class Recycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int aluminum = sc.nextInt();
            int plastic = sc.nextInt();
            int glass = sc.nextInt();
            double total = aluminum * 0.05 * 31 + plastic * 0.1 * 15 + glass * 0.2 / 2;
            System.out.printf("$%.2f%n", total);
        }
    }
}
