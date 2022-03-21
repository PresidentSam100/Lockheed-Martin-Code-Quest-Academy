import java.util.Scanner;
// Problem 115: Animal Farm
// Author: Shelly Adamie, Fort Worth, Texas, United States
// Originally Published: Code Quest Australia 2019
// Code Written By: Sam L.
public class AnimalFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int turkey = sc.nextInt();
            int goat = sc.nextInt();
            int horse = sc.nextInt();
            System.out.println(turkey * 2 + goat * 4 + horse * 4);
        }
    }
}
