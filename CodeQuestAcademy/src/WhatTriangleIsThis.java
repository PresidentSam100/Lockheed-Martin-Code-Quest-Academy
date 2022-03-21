import java.util.Scanner;
// Problem 27: What Triangle Is This?
// Difficulty: Easy
// Originally Published: Code Quest 2016
// Code Written By: Sam L.
public class WhatTriangleIsThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            String[] s = str.split(", ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int mid = a + b + c - min - max;
            if (min + mid <= max)
                System.out.println("Not a Triangle");
            else if (min == max)
                System.out.println("Equilateral");
            else if (min == mid || mid == max)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }
}
