import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
// Problem 151: Bring John Glenn Home
// Difficulty: Medium/Hard
// Author: Wesley Holcombe, Colorado Springs, Colorado, United States
// Originally Published Code Quest 2021
// Code Written By: Sam L.
public class BringJohnGlennHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double h = sc.nextDouble();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++)
            {
                y = y + h * Math.sin(x) / x;
                x = h + x;
            }
            // Remove trailing zeroes in decimal place
            String s = String.format("%.3f", y);
            int j = s.length() - 1;
            while (j > s.indexOf(".") && s.charAt(j) == '0')
            {
                s = s.substring(0, j);
                j--;
            }
            System.out.println(s);
        }
    }
}
/*
2 1 5 0.5 6
-.54 0 0.01 8
 */