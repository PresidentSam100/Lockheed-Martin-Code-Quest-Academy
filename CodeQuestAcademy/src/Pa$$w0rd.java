import java.util.Scanner;
// Problem 8: Pa$$w0rd
// Author: Brett Reynolds, Orlando, Florida, United States
// Difficulty: Medium
// Code Written By: Sam L.
public class Pa$$w0rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String s = sc.nextLine();
            boolean len = s.length() >= 8;
            boolean character = false;
            int lower = s.matches(".*[A-Z].*")?1:0;
            int upper = s.matches(".*[a-z].*")?1:0;
            int number = s.matches(".*\\d.*")?1:0;
            int extra = s.matches(".*\\W.*")?1:0;
            character = (lower + upper + number + extra) >= 3;
            boolean two = !s.matches(".*(.)\\1\\1+.*");
            if (len && character && two)
            {
                System.out.println("VALID");
            }
            else
            {
                System.out.println("INVALID");
            }
        }
    }
}
