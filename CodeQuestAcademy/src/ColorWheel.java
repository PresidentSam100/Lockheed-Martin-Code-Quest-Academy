import java.util.Scanner;
// Problem 68: Color Wheel
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class ColorWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            if (s.equals("red") || s.equals("yellow") || s.equals("blue"))
            {
                System.out.println("No colors need to be mixed to make " + s + ".");
            }
            else if (s.equals("red-orange") || s.equals("orange") || s.equals("yellow-orange"))
            {
                System.out.println("In order to make " + s + ", red and yellow must be mixed.");
            }
            else if (s.equals("yellow-green") || s.equals("green") || s.equals("blue-green"))
            {
                System.out.println("In order to make " + s + ", blue and yellow must be mixed.");
            }
            else if (s.equals("blue-violet") || s.equals("violet") || s.equals("red-violet"))
            {
                System.out.println("In order to make " + s + ", blue and red must be mixed.");
            }
        }
    }
}
