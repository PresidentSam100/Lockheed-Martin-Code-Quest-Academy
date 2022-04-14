import java.util.Scanner;
// Problem 80: Chroma Key Effect
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class ChromaKeyEffect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int Cr = sc.nextInt();
            int Cg = sc.nextInt();
            int Cb = sc.nextInt();
            int T = sc.nextInt();
            int Fr = sc.nextInt();
            int Fg = sc.nextInt();
            int Fb = sc.nextInt();
            int Br = sc.nextInt();
            int Bg = sc.nextInt();
            int Bb = sc.nextInt();
            double d = Math.sqrt(Math.pow(Cr - Fr, 2) + Math.pow(Cg - Fg, 2) + Math.pow(Cb - Fb, 2));
            if (d <= T)
            {
                System.out.println(Br + " " + Bg + " " + Bb);
            }
            else
            {
                System.out.println(Fr + " " + Fg + " " + Fb);
            }
        }
    }
}
/*
3
0 176 80 30 12 184 90 132 101 76
0 176 80 10 12 184 90 132 101 76
0 176 80 30 100 95 93 147 113 87
 */