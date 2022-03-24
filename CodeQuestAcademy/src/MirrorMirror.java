import java.util.Scanner;
// Problem 62: Mirror Mirror
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class MirrorMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            System.out.println(sb.reverse().toString());
        }
    }
}
