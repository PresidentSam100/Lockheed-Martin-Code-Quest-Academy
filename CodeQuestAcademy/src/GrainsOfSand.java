import java.math.BigInteger;
import java.util.Scanner;
// Problem 12: Grains of Sand
// Difficulty: Easy
// Originally Published: Code Quest 2015
// Code Written By: Sam L.
public class GrainsOfSand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            BigInteger sand = new BigInteger("0");
            for (int j = 0; j < N; j++)
            {
                sand = sand.add(sc.nextBigInteger());
            }
            System.out.println(sand.toString());
        }
    }
}
