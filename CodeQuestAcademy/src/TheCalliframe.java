import java.util.Scanner;
// Problem 6: The Calliframe
// Author: Victor Santa, Aguadilla, Puerto Rico, United States
// Difficulty: Medium
// Code Written By: Sam L.
public class TheCalliframe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String s = sc.nextLine();
            if (!s.matches("[a-zA-Z]+") || s.length() < 5 || s.length() > 32)
            {
                System.out.println("Not a Calliframe");
                continue;
            }
            System.out.println(s);
            for (int j = 1; j < s.length() - 1; j++)
            {
                System.out.print(s.substring(j, j + 1));
                for (int k = 0; k < s.length() - 2; k++)
                {
                    System.out.print(" ");
                }
                System.out.println(s.substring(s.length() - j - 1, s.length() - j));
            }
            StringBuilder sb = new StringBuilder(s).reverse();
            System.out.println(sb);
        }
    }
}
/*
5
CodeQuest
Air
Programming
Lov3 is 1n 7he @ir
The Black Mamba
 */