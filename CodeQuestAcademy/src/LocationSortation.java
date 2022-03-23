import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Problem 69: Location Sortation
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class LocationSortation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < T; i++)
        {
            String country = sc.next();
            arr.add(country);
        }
        Collections.sort(arr);
        for (int i = 0; i < T; i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
