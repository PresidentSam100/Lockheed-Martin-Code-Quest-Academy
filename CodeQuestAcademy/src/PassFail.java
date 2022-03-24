import java.util.Scanner;
// Problem 65: Pass/Fail
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int grade = sc.nextInt();
            if (grade >= 70)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
    }
}
