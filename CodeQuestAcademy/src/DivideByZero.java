import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
// Problem 122: Divide By Zero
// Author: Danny Lin, Greenville, South Carolina, United States
// Originally Published: Code Quest Australia 2019
// Difficulty: Medium
// Code Written By: Sam L.
public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String dividend = sc.next();
            String divisor = sc.next();
            try
            {
                BigDecimal a = new BigDecimal(dividend);
            }
            catch (Exception e)
            {
                System.out.println("Invalid Dividend");
                continue;
            }
            try
            {
                BigDecimal b = new BigDecimal(divisor);
            }
            catch (Exception e)
            {
                System.out.println("Invalid Divisor");
                continue;
            }
            if (Double.parseDouble(divisor) == 0)
            {
                System.out.println("Divide By Zero");
            }
            else
            {
                BigDecimal a = new BigDecimal(dividend);
                BigDecimal b = new BigDecimal(divisor);
                BigDecimal c = a.divide(b, 1, RoundingMode.HALF_UP);
                System.out.println(c);
            }
        }
    }
}
