import java.util.Scanner;
// Problem 42: Is There an Echo In Here?
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class IsThereAnEchoInHere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String s = sc.nextLine();
            System.out.println(s);
            System.out.println(s);
        }
    }
}
