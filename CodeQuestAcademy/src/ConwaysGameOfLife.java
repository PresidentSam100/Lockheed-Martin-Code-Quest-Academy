import java.util.Scanner;
// Problem 105: Conway's Game of Life
// Author: Louis Ronat, Denver, Colorado, United States
// Originally Published: Code Quest 2019
// Difficulty: Medium
// Code Written By: Sam L.
public class ConwaysGameOfLife {
    static String[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int X = sc.nextInt();
            arr = new String[10][10];
            for (int r = 0; r < 10; r++)
            {
                String s = sc.next();
                for (int c = 0; c < 10; c++)
                {
                    arr[r][c] = s.substring(c, c + 1);
                }
            }
            for (int j = 0; j < X; j++)
            {
                nextGen();
            }
            for (int r = 0; r < 10; r++)
            {
                for (int c = 0; c < 10; c++)
                {
                    System.out.print(arr[r][c]);
                }
                System.out.println();
            }
        }
    }
    public static void nextGen()
    {
        String[][] temp = new String[10][10];
        for (int r = 0; r < 10; r++)
        {
            for (int c = 0; c < 10; c++)
            {
                int adjacent = 0;
                if (r > 0 && c > 0)
                {
                    adjacent += arr[r - 1][c - 1].equals("1")?1:0;
                }
                if (r > 0)
                {
                    adjacent += arr[r - 1][c].equals("1")?1:0;
                }
                if (r > 0 && c < 9)
                {
                    adjacent += arr[r - 1][c + 1].equals("1")?1:0;
                }
                if (c < 9)
                {
                    adjacent += arr[r][c + 1].equals("1")?1:0;
                }
                if (r < 9 && c < 9)
                {
                    adjacent += arr[r + 1][c + 1].equals("1")?1:0;
                }
                if (r < 9)
                {
                    adjacent += arr[r + 1][c].equals("1")?1:0;
                }
                if (r < 9 && c > 0)
                {
                    adjacent += arr[r + 1][c - 1].equals("1")?1:0;
                }
                if (c > 0)
                {
                    adjacent += arr[r][c - 1].equals("1")?1:0;
                }

                if (arr[r][c].equals("1"))
                {
                    if (!(adjacent == 2 || adjacent == 3))
                    {
                        temp[r][c] = "0";
                    }
                    else
                    {
                        temp[r][c] = "1";
                    }
                }
                else if (arr[r][c].equals("0"))
                {
                    if (adjacent == 3)
                    {
                        temp[r][c] = "1";
                    }
                    else
                    {
                        temp[r][c] = "0";
                    }
                }
            }
        }
        arr = temp;
    }
}
