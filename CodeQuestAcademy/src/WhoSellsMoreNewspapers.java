import java.util.Scanner;
// Problem 61: Who Sells More Newspapers?
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class WhoSellsMoreNewspapers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int times = sc.nextInt();
            int herald = sc.nextInt();
            if (times > herald)
                System.out.println("Times has " + (times - herald) + " more subscribers");
            else if (times < herald)
                System.out.println("Herald has " + (herald - times) + " more subscribers");
            else
                System.out.println("Times and Herald have the same number of subscribers");
        }
    }
}
