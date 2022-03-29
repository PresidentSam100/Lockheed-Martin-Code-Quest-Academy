import java.util.Scanner;
// Problem 141: Confusing Conversions
// Author: Ryan Regensburger, Huntsville, Alabama, Untied States
// Originally Published: Code Quest 2021
// Difficulty: Medium
// Code Written By: Sam L.
public class ConfusingConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            String function = s[0];
            if (function.equals("formatHeight"))
            {
                System.out.println(s[1] + "\'" + s[2] + "\"");
            }
            else if (function.equals("formatDate"))
            {
                System.out.printf("%04d%02d%02d\n", Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            }
            else if (function.equals("concatenate"))
            {
                System.out.println(str.substring(str.indexOf(" ") + 1).replaceAll(" ", ","));
            }
        }
    }
}
