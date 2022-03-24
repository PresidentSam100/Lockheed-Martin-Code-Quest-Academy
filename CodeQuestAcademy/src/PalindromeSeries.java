import java.util.ArrayList;
import java.util.Scanner;
// Problem 76: Palindrome Series
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class PalindromeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            boolean all = true;
            ArrayList<Integer> indexes = new ArrayList<>();
            for (int j = 1; j <= N; j++)
            {
                String s = sc.next().toLowerCase();
                StringBuilder sb = new StringBuilder(s);
                if (!sb.toString().equals(sb.reverse().toString()))
                {
                    all = false;
                    indexes.add(j);
                }
            }
            if (all)
                System.out.println("True");
            else
            {
                System.out.print("False - ");
                for (int j = 0; j < indexes.size(); j++)
                {
                    if (j != 0)
                        System.out.print(", ");
                    System.out.print(indexes.get(j));
                }
                System.out.println();
            }
        }
    }
}
