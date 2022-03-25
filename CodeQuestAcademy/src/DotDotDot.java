import java.util.Scanner;
// Problem 137: Dot Dot Dot
// Author: Shelly Adamie, Fort Worth, Texas, United States
// Originally Published: Code Quest 2021
// Difficulty: Medium
// Code Written By: Sam L.
public class DotDotDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String word = sc.next();
            int dots = 0;
            for (int j = 0; j < word.length(); j++)
            {
                dots += word.charAt(j) - 'a' + 1;
            }
            System.out.println(dots);
        }
    }
}
