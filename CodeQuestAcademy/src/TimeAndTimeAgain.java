import java.util.ArrayList;
import java.util.Scanner;
// Problem 97: Time and Time Again
// Author: Jonathan Brown, Fort Worth, Texas, United States
// Originally Published: Code Quest 2019
// Difficulty: Medium
// Code Written By: Sam L.
public class TimeAndTimeAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            int hour = 0, minute = 0, second = 0;
            if (str.contains("h"))
            {
                int ind = str.indexOf("h");
                hour = Integer.parseInt(str.substring(ind - 1, ind));
                if (ind > 1 && Character.isDigit(str.charAt(ind - 2))) {
                    hour += 10 * Integer.parseInt(str.substring(ind - 2, ind - 1));
                }
            }
            if (str.contains("m"))
            {
                int ind = str.indexOf("m");
                minute = Integer.parseInt(str.substring(ind - 1, ind));
                if (ind > 1 && Character.isDigit(str.charAt(ind - 2))) {
                    minute += 10 * Integer.parseInt(str.substring(ind - 2, ind - 1));
                }
            }
            if (str.contains("s"))
            {
                int ind = str.indexOf("s");
                second = Integer.parseInt(str.substring(ind - 1, ind));
                if (ind > 1 && Character.isDigit(str.charAt(ind - 2))) {
                    second += 10 * Integer.parseInt(str.substring(ind - 2, ind - 1));
                }
            }
            System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
        }
    }
}
