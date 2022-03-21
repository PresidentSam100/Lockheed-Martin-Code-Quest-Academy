import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// Problem 46: Donor Sort
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class DonorSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String a = sc.next();
            String b = sc.next();
            String[] A = a.split(",");
            String[] B = b.split(",");
            ArrayList<String> one = new ArrayList<>(Arrays.asList(A));
            ArrayList<String> two = new ArrayList<>();
            ArrayList<String> three = new ArrayList<>();
            for (int j = 0; j < B.length; j++)
            {
                if (one.contains(B[j]))
                {
                    two.add(one.remove(one.indexOf(B[j])));
                }
                else
                {
                    three.add(B[j]);
                }
            }
            Collections.sort(one);
            Collections.sort(two);
            Collections.sort(three);
            for (int j = 0; j < one.size(); j++)
            {
                if (j != 0)
                    System.out.print(",");
                System.out.print(one.get(j));
            }
            System.out.println();
            for (int j = 0; j < two.size(); j++)
            {
                if (j != 0)
                    System.out.print(",");
                System.out.print(two.get(j));
            }
            System.out.println();
            for (int j = 0; j < three.size(); j++)
            {
                if (j != 0)
                    System.out.print(",");
                System.out.print(three.get(j));
            }
            System.out.println();
        }
    }
}
