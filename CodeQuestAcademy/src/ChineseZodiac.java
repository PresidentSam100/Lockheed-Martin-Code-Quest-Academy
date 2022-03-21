import java.util.Scanner;
// Problem 1: Chinese Zodiac
// Difficulty: Easy
// Author: Tai Do, Sunnyvale, California, United States
// Code Written By: Sam L.
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            String aspect = N % 2 == 0?"Yang":"Yin";
            int e = ((N - 4) % 10 / 2);
            String element = "";
            if (e == 0)
                element = "Wood";
            else if (e == 1)
                element = "Fire";
            else if (e == 2)
                element = "Earth";
            else if (e == 3)
                element = "Metal";
            else if (e == 4)
                element = "Water";
            int z = (N - 4) % 12;
            String animal = "";
            if (z == 0)
                animal = "Rat";
            else if (z == 1)
                animal = "Ox";
            else if (z == 2)
                animal = "Tiger";
            else if (z == 3)
                animal = "Rabbit";
            else if (z == 4)
                animal = "Dragon";
            else if (z == 5)
                animal = "Snake";
            else if (z == 6)
                animal = "Horse";
            else if (z == 7)
                animal = "Goat";
            else if (z == 8)
                animal = "Monkey";
            else if (z == 9)
                animal = "Rooster";
            else if (z == 10)
                animal = "Dog";
            else if (z == 11)
                animal = "Pig";
            System.out.println(N + " " + aspect + " " + element + " " + animal);
        }
    }
}
