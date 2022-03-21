import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Problem 136: Anti-Asteroid Weapon
// Author: Author: Luis Rivera, Aguadilla, Puerto Rico, United States
// Originally Published: Code Quest 2021
// Code Written By: Sam L.
public class AntiAsteroidWeapon {
    static class Asteroid
    {
        int X;
        int Y;
        double d;
        public Asteroid(int X, int Y)
        {
            this.X = X;
            this.Y = Y;
            d = Math.sqrt(X*X+Y*Y);
        }
        public String toString()
        {
            return X + " " + Y;
        }
    }
    static class comp implements Comparator<Asteroid>
    {
        @Override
        public int compare(Asteroid a1, Asteroid a2)
        {
            if (a1.d < a2.d)
                return -1;
            else if (a1.d > a2.d)
                return 1;
            else
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int A = sc.nextInt();
            ArrayList<Asteroid> arr = new ArrayList<>();
            for (int j = 0; j < A; j++)
            {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                arr.add(new Asteroid(X, Y));
            }
            Collections.sort(arr, new comp());
            for (int j = 0; j < arr.size(); j++)
                System.out.println(arr.get(j));
        }
    }
}
