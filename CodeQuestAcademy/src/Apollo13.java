import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Problem 77: Apollo 13
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class Apollo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            double x = sc.nextDouble();
            x += 180;
            x %= 360;
            double y = sc.nextDouble();
            y += 180;
            y %= 360;
            double z = sc.nextDouble();
            z += 180;
            z %= 360;
            System.out.printf("%06.2f %06.2f %06.2f\n", x, y, z);
        }
    }
}
