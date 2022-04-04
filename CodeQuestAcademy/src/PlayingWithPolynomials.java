import java.util.Scanner;
// Problem 147: Playing with Polynomials
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class PlayingWithPolynomials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] A = a.split(" ");
            String[] B = b.split(" ");
            long[] poly = new long[A.length + B.length];
            for (int x = 0; x < A.length; x++)
            {
                for (int y = 0; y < B.length; y++)
                {
                    poly[x + y] += Long.parseLong(A[x]) * Long.parseLong(B[y]);
                }
            }
            boolean add = false;
            for (int j = 0; j < poly.length; j++)
            {
                if (poly[j] == 0)
                {
                    continue;
                }
                if (add && poly[j] > 0)
                {
                    System.out.print("+");
                }
                if (Math.abs(poly[j]) != 1 || j == 0)
                {
                    System.out.print(poly[j]);
                    add = true;
                }
                else if (poly[j] == -1)
                {
                    System.out.print("-");
                    add = true;
                }
                if (j == 1)
                {
                    System.out.print("x");
                    add = true;
                }
                else if (j >= 2)
                {
                    System.out.print("x^" + j);
                    add = true;
                }
            }
            System.out.println();
        }
    }
}
