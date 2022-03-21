import java.util.Scanner;
// Problem 96: Foveated Rendering
// Difficulty: Easy
// Author: Gary Hoffman, Denver, Colorado, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class FoveatedRendering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int size = 20;
        for (int i = 0; i < T; i++)
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            for (int r = 0; r < size; r++)
            {
                for (int c = 0; c < size; c++)
                {
                    int check = Math.max(Math.abs(r - row), Math.abs(c - col));
                    if (check == 0)
                        System.out.print(100);
                    else if (check == 1)
                        System.out.print(50);
                    else if (check == 2)
                        System.out.print(25);
                    else
                        System.out.print(10);
                    if (c + 1 != size)
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
