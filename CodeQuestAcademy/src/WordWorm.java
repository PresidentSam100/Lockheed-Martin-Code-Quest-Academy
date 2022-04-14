import java.util.Scanner;
// Problem 16: Word Worm
// Originally Published: Code Quest 2015
// Difficulty: Medium
// Code Written By: Sam L.
public class WordWorm {
    public static String[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int R = sc.nextInt();
            int C = sc.nextInt();
            arr = new String[R][C];
            for (int r = 0; r < R; r++)
            {
                for (int c = 0; c < C; c++)
                {
                    String s = sc.next();
                    arr[r][c] = s;
                }
            }
            int N = sc.nextInt();
            for (int n = 0; n < N; n++)
            {
                String s = sc.next();
                boolean work = false;
                for (int r = 0; r < R; r++)
                {
                    for (int c = 0; c < C; c++)
                    {
                        if (traverse(r, c, 0, s))
                        {
                            work = true;
                            break;
                        }
                    }
                    if (work)
                    {
                        break;
                    }
                }
                if (work)
                {
                    System.out.println(s);
                }
            }
        }
    }
    public static boolean traverse(int r, int c, int index, String s)
    {
        if (index == s.length())
            return true;
        if (r < 0 || c < 0 || r > arr.length - 1 || c > arr[r].length - 1)
            return false;
        if (s.charAt(index) != arr[r][c].charAt(0))
            return false;
        index++;
        return traverse(r, c + 1, index, s) || traverse(r, c - 1, index, s) || traverse(r + 1, c, index, s) || traverse(r - 1, c, index, s) || traverse(r + 1, c + 1, index, s) || traverse(r - 1, c + 1, index, s) || traverse(r - 1, c - 1, index, s) || traverse(r + 1, c - 1, index, s);
    }
}
/*
1
6 7
A D E K H E Q
B X E H K J R
J I L O C K D
R P I G N A H
T E N E F H M
J U O P L N T
4
LOCKHEED
PLANE
JET
ENGINE
 */