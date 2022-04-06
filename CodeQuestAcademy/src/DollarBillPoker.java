import java.util.Arrays;
import java.util.Scanner;
// Problem 55: Dollar Bill Poker
// Originally Published: Code Quest 2017
// Difficulty: Medium
// Code Written By: Sam L.
public class DollarBillPoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            System.out.print(s + " = ");
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            s = String.valueOf(arr);
            boolean work = false;
            // Check FIVE OF A KIND
            for (int j = 1; j <= 9; j++)
            {
                if (s.contains("" + j + j + j + j + j))
                {
                    work = true;
                    System.out.println("FIVE OF A KIND");
                    break;
                }
            }
            if (work)
                continue;
            // Check FOUR OF A KIND
            for (int j = 1; j <= 9; j++)
            {
                if (s.contains("" + j + j + j + j))
                {
                    work = true;
                    System.out.println("FOUR OF A KIND");
                    break;
                }
            }
            if (work)
                continue;
            // Check FULL HOUSE
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    if (j != k && (s.contains("" + j + j) && s.contains("" + k + k + k) || s.contains("" + k + k) && s.contains("" + j + j + j)))
                    {
                        work = true;
                        System.out.println("FULL HOUSE");
                        break;
                    }
                }
                if (work)
                    break;
            }
            if (work)
                continue;
            // Check STRAIGHT
            for (int j = 1; j <= 5; j++)
            {
                if (s.matches(".*" + j + ".*" + (j + 1) + ".*" + (j + 2) + ".*" + (j + 3) + ".*" + (j + 4) + ".*"))
                {
                    work = true;
                    System.out.println("STRAIGHT");
                    break;
                }
            }
            if (work)
                continue;
            // Check THREE OF A KIND
            for (int j = 1; j <= 9; j++)
            {
                if (s.contains("" + j + j + j))
                {
                    work = true;
                    System.out.println("THREE OF A KIND");
                    break;
                }
            }
            if (work)
                continue;
            // Check TWO PAIR
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    if (j != k && s.contains("" + j + j) && s.contains("" + k + k))
                    {
                        work = true;
                        System.out.println("TWO PAIR");
                        break;
                    }
                }
                if (work)
                    break;
            }
            if (work)
                continue;
            // Check PAIR
            for (int j = 1; j <= 9; j++)
            {
                if (s.contains("" + j + j))
                {
                    work = true;
                    System.out.println("PAIR");
                    break;
                }
            }
            if (work)
                continue;
            System.out.println(s.substring(s.length() - 1));
        }
    }
}
