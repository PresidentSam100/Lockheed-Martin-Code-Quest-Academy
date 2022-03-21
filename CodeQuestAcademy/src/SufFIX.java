import java.util.Scanner;
// Problem 72: SufFIX
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class SufFIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            s = s.replaceAll("\\D","");
            if (s.endsWith("1") && !("0" + s).endsWith("11"))
                System.out.println(s + "st");
            else if (s.endsWith("2") && !("0" + s).endsWith("12"))
                System.out.println(s + "nd");
            else if (s.endsWith("3") && !("0" + s).endsWith("13"))
                System.out.println(s + "rd");
            else
                System.out.println(s + "th");
        }
    }
}
