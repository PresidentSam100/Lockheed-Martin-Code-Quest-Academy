import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Problem 79: Bishop's Move
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class BishopsMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String[] RC = sc.next().split(",");
            int R = Integer.parseInt(RC[0]);
            int C = Integer.parseInt(RC[1]);
            String[] r1c1 = sc.next().split(",");
            int r1 = Integer.parseInt(r1c1[0]);
            int c1 = Integer.parseInt(r1c1[1]);
            String[] r2c2 = sc.next().split(",");
            int r2 = Integer.parseInt(r2c2[0]);
            int c2  = Integer.parseInt(r2c2[1]);
            if ((r1 + c1) % 2 == (r2 + c2) % 2 && r1 >= 1 && r2 >= 1 && r1 <= R && r2 <= R && c1 >= 1 && c2 >= 1 && c1 <= C && c2 <= C)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
