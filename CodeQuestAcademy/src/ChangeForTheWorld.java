import java.util.Scanner;
// Problem 26: Change for the World
// Originally Published: Code Quest 2016
// Difficulty: Easy
// Code Written By: Sam L.
public class ChangeForTheWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            double money = Double.parseDouble(s.substring(1));
            int quarter = (int)(money / 0.25);
            money -= quarter * 0.25;
            money = Math.round(money * 100) / 100.0;
            int dime = (int)(money / 0.1);
            money -= dime * 0.1;
            money = Math.round(money * 100) / 100.0;
            int nickel = (int)(money / 0.05);
            money -= nickel * 0.05;
            money = Math.round(money * 100) / 100.0;
            int penny = (int)(money / 0.01);
            System.out.println(s);
            System.out.println("Quarters=" + quarter);
            System.out.println("Dimes=" + dime);
            System.out.println("Nickels=" + nickel);
            System.out.println("Pennies=" + penny);
        }
    }
}
/*
4
$3.87
$2.74
$14.84
$0.76
 */