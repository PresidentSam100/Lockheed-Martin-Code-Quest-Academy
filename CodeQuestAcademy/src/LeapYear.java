import java.util.Scanner;
// Problem 13: Leap Year
// Difficulty: Easy
// Originally Published: Code Quest 2015
// Code Written By: Sam L.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            for (int j = 0; j < N; j++)
            {
                int year = sc.nextInt();
                if (year < 1582)
                    System.out.println("No");
                else if (year % 4 != 0)
                    System.out.println("No");
                else if (year % 100 != 0)
                    System.out.println("Yes");
                else if (year % 400 != 0)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
        }
    }
}
