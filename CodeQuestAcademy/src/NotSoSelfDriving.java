import java.util.Scanner;
// Problem B: Not So Self-Driving
// Author: Chris Liu, California High School
// Difficulty: Practice
// Code Written By: Sam L.
public class NotSoSelfDriving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            String[] arr = s.split(":");
            double a = Double.parseDouble(arr[0]);
            double b = Double.parseDouble(arr[1]);
            if (b / a <= 1)
                System.out.println("SWERVE");
            else if (b / a <= 5)
                System.out.println("BRAKE");
            else
                System.out.println("SAFE");
        }
    }
}
