import java.util.Scanner;
// Problem 86: Tic Tac Toe Checker
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class TicTacToeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            String ans = "TIE";
            // Horizontal and Vertical
            for (int j = 0; j < 3; j++)
            {
                if (s.substring(j * 3, j * 3 + 3).matches("X{3}|O{3}"))
                {
                    ans = s.substring(j * 3, j * 3 + 1) + " WINS";
                }
                if ((s.substring(j, j + 1) + s.substring(j + 3, j + 4) + s.substring(j + 6, j + 7)).matches("X{3}|O{3}"))
                {
                    ans = s.substring(j, j + 1) + " WINS";
                }
            }
            // Diagonal
            if ((s.substring(0, 1) + s.substring(4, 5) + s.substring(8, 9)).matches("X{3}|O{3}"))
            {
                ans = s.substring(4, 5) + " WINS";
            }
            if ((s.substring(2, 3) + s.substring(4, 5) + s.substring(6, 7)).matches("X{3}|O{3}"))
            {
                ans = s.substring(4, 5) + " WINS";
            }
            System.out.println(s + " = " + ans);
        }
    }
}
/*
8
O-X-OOXXX
XOX-OXO-X
X-O-XO--O
OXOXXOXOX
--X-X-XOO
XXOXO-O--
XOXXOOOXX
---------
 */