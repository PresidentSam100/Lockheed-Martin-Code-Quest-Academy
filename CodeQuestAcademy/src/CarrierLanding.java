import java.util.Scanner;
// Problem 18: Carrier Landing
// Originally Published: Code Quest 2015
// Difficulty: Medium
// Code Written By: Sam L.
public class CarrierLanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("([\n,])");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            for (int j = 0; j < N; j++)
            {
                sc.nextLine();
                String name = sc.nextLine();
                double airX = sc.nextDouble();
                double airY = sc.nextDouble();
                double startX = sc.nextDouble();
                double startY = sc.nextDouble();
                double endX = sc.nextDouble();
                double endY = sc.nextDouble();
                double slopeS = (airY - startY) / (airX - startX);
                double slopeE = (airY - endY) / (airX - endX);
                if (slopeS >= -1.6 && slopeS <= -0.8 && slopeE >= -1.6 && slopeE <= -0.8)
                    System.out.println(name + ", Clear To Land!");
                else
                    System.out.println(name + ", Abort Landing!");
            }
        }
    }
}
