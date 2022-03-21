import java.util.Scanner;
// Problem 114: Someting's Missing
// Difficulty: Easy
// Author: Shelly Adamie, Fort Worth, Texas, United States
// Originally Published: Code Quest Australia 2019
// Code Written By: Sam L.
public class RoundEmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int height = sc.nextInt();
            int width = sc.nextInt();
            int length = sc.nextInt();
            if (height % 2 == 0)
                height += 2;
            else
                height++;
            if (width % 2 == 0)
                width += 2;
            else
                width++;
            if (length % 2 == 0)
                length += 2;
            else
                length++;
            System.out.println(height + " " + width + " " + length);
        }
    }
}
