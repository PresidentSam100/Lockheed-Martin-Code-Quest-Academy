import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
// Problem 29: Mobile Miser
// Difficulty: Easy
// Originally Published: Code Quest 2016
// Code Written By: Sam L.
public class MobileMiser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            BigDecimal d = new BigDecimal(s.substring(1));
            System.out.println("Total of the bill: " + s);
            BigDecimal tip15 = d.multiply(new BigDecimal("0.15"));
            tip15 = tip15.setScale(2, RoundingMode.HALF_UP);
            BigDecimal tip18 = d.multiply(new BigDecimal("0.18"));
            tip18 = tip18.setScale(2, RoundingMode.HALF_UP);
            BigDecimal tip20 = d.multiply(new BigDecimal("0.20"));
            tip20 = tip20.setScale(2, RoundingMode.HALF_UP);
            System.out.println("15% = $" + tip15);
            System.out.println("18% = $" + tip18);
            System.out.println("20% = $" + tip20);
        }
    }
}
