import java.util.Scanner;
// Problem 135: Phonebook
// Difficulty: Easy
// Author: Jonathan Tran, Dallas, Texas, United States
// Originally Published: Code Quest 2021
// Code Written By: Sam L.
public class Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String phoneNumber = sc.next();
            String format = sc.next();
            if (format.equals("PARENTHESES"))
            {
                System.out.println("(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6));
            }
            else if (format.equals("DASHES"))
            {
                System.out.println(phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6));
            }
            else if (format.equals("PERIODS"))
            {
                System.out.println(phoneNumber.substring(0, 3) + "." + phoneNumber.substring(3, 6) + "." + phoneNumber.substring(6));
            }
        }
    }
}
