import java.util.Scanner;
// Problem 117: Whack-A-Mole
// Difficulty: Easy
// Author: Louis Ronat, Denver, Colorado, United States
// Originally Published: Code Quest Australia 2019
// Code Written By: Sam L.
public class WhackAMole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String ans = "";
            for (int j = 1; j <= 9; j++)
            {
                String pos = sc.next();
                if (pos.equals("M"))
                {
                    ans += j + " ";
                }
            }
            System.out.println(ans.trim());
        }
    }
}
