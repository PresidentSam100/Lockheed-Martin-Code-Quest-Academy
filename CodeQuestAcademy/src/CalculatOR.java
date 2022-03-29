import java.util.ArrayList;
import java.util.Scanner;
// Problem 119: CalculatOR
// Author: Brett Reynolds, Orlando, Florida, United States
// Originally Published: Code Quest Australia 2019
// Difficulty: Medium
// Code Written By: Sam L.
public class CalculatOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            double a = sc.nextDouble();
            String op = sc.next();
            double b = sc.nextDouble();
            if (op.equals("+"))
            {
                System.out.printf("%.1f %.1f\n", a + b, b + a);
            }
            else if (op.equals("-"))
            {
                System.out.printf("%.1f %.1f\n", a - b, b - a);
            }
            else if (op.equals("*"))
            {
                System.out.printf("%.1f %.1f\n", a * b, b * a);
            }
            else if (op.equals("/"))
            {
                System.out.printf("%.1f %.1f\n", a / b, b / a);
            }
        }
    }
}
