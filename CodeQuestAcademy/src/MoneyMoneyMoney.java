import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Problem 15: Money, Money, Money!
// Difficulty: Easy
// Originally Published: Code Quest 2015
// Code Written By: Sam L.
public class MoneyMoneyMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String region = sc.next();
            int N = sc.nextInt();
            ArrayList<GDP> gdps = new ArrayList<>();
            for (int j = 0; j < N; j++)
            {
                double income = sc.nextDouble();
                int year = sc.nextInt();
                gdps.add(new GDP(income, year));
            }
            Collections.sort(gdps, new comp());
            System.out.println(region + ":");
            for (int j = 0; j < N; j++)
            {
                System.out.println(gdps.get(j));
            }
        }
    }
    static class GDP
    {
        private double income;
        private int year;
        private String asterisks;

        public GDP(double income, int year)
        {
            this.income = income;
            this.year = year;
            asterisks = "";
            asterisks();
        }

        public void asterisks()
        {
            long count = Math.round(income / 1000);
            for (int i = 0; i < count; i++)
                asterisks += "*";
        }

        public String toString()
        {
            return year + " " + asterisks;
        }

    }
    static class comp implements Comparator<GDP>
    {
        @Override
        public int compare(GDP o1, GDP o2)
        {
            if (o1.year < o2.year)
                return -1;
            else if (o1.year > o2.year)
                return 1;
            else
                return 0;
        }
    }
}
