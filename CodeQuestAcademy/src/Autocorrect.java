import java.util.ArrayList;
import java.util.Scanner;
// Problem 3: Autocorrect
// Author: Matthew Schmeiser, Montreal, Québec, Canada
// Difficulty: Easy
// Code Written By: Sam L.
public class Autocorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int D = sc.nextInt();
            int W = sc.nextInt();
            ArrayList<String> dictionary = new ArrayList<>();
            for (int j = 0; j < D; j++)
            {
                dictionary.add(sc.next());
            }
            for (int j = 0; j < W; j++)
            {
                String word = sc.next();
                int shortest = word.length() + 1;
                String ans = "";
                for (int k = 0; k < D; k++)
                {
                    if (dictionary.get(k).length() == word.length())
                    {
                        int hamming = 0;
                        for (int l = 0; l < word.length(); l++)
                        {
                            if (dictionary.get(k).charAt(l) != word.charAt(l))
                            {
                                hamming++;
                            }
                        }
                        if (hamming < shortest)
                        {
                            shortest = hamming;
                            ans = dictionary.get(k);
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
