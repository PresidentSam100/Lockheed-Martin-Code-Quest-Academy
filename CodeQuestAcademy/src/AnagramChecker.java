import java.util.Arrays;
import java.util.Scanner;
// Problem 28: Anagram Checker
// Originally Published: Code Quest 2016
// Difficulty: Easy
// Code Written By: Sam L.
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String str = sc.next();
            String[] s = str.split("\\|");
            char[] s1 = s[0].toCharArray();
            char[] s2 = s[1].toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            System.out.print(str + " = ");
            if (Arrays.equals(s1, s2) && !s[0].equals(s[1]))
                System.out.println("ANAGRAM");
            else
                System.out.println("NOT AN ANAGRAM");
        }
    }
}
