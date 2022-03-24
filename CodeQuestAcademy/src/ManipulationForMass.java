import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
// Problem 70: Manipulation for Mass
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class ManipulationForMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            BigDecimal density = sc.nextBigDecimal();
            BigDecimal volume = sc.nextBigDecimal();
            BigDecimal mass = density.multiply(volume);
            mass = mass.setScale(2, RoundingMode.HALF_UP);
            System.out.println(mass.toString());
        }
    }
}
