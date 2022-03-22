import java.util.Scanner;
// Problem 14: Is It Hot In Here?
// Difficulty: Easy
// Originally Published: Code Quest 2015
// Code Written By: Sam L.
public class IsItHotInHere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            for (int j = 0; j < N; j++)
            {
                String temperature = sc.next();
                String scale = sc.next();
                String newScale = scale.equals("C")?"F":"C";
                double newTemperature = 0;
                if (scale.equals("C"))
                {
                    newTemperature = 9.0 /5 * Double.parseDouble(temperature) + 32;
                }
                else if (scale.equals("F"))
                {
                    newTemperature = 5.0 / 9 * (Double.parseDouble(temperature) - 32);
                }
                System.out.printf("%s %s = %.1f %s%n", temperature, scale, newTemperature, newScale);
            }
        }
    }
}
