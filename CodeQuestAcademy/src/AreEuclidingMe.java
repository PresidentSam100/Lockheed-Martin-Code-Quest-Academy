import java.util.Scanner;
// Problem 77: Apollo 13
// Difficulty: Medium
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class AreEuclidingMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String str = sc.next();
            String[] s = str.split(",");
            int a = Math.max(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            int b = Math.min(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            do
            {
                System.out.println(a + "-" + b + "=" + (a - b));
                int temp1 = a - b;
                int temp2 = b;
                a = Math.max(temp1, temp2);
                b = Math.min(temp1, temp2);
            }
            while (a - b != 0);
            System.out.println(a + "-" + b + "=" + (a - b));
            if (a == 1 && b == 1)
                System.out.println("COPRIME");
            else
                System.out.println("NOT COPRIME");
        }
    }
}
