import java.util.Scanner;
// Problem 95: Image Compression
// Difficulty: Easy
// Author: Steve Brailsford, Marietta, Georgia, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class ImageCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int X = sc.nextInt();
            double max = Integer.MIN_VALUE;
            double min = Integer.MAX_VALUE;
            double[] arr = new double[X];
            for (int j = 0; j < X; j++)
            {
                arr[j] = sc.nextDouble();
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
            }
            for (int j = 0; j < X; j++)
            {
                long output = Math.round((arr[j] - min) / (max - min) * 255);
                System.out.println(output);
            }
        }
    }
}
