import java.util.Scanner;
// Problem 84: Piecewise Encrypter
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class PiecewiseEncrypter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            String encrypt = "";
            for (int j = 0; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if (c >= 'A' && c <= 'E')
                {
                    encrypt += (char)(c + 6);
                }
                else if (c >= 'F' && c <= 'J')
                {
                    encrypt += (char)((Math.pow((c - 64), 2) - 1) % 26 + 65);
                }
                else if (c >= 'K' && c <= 'O')
                {
                    encrypt += (char)(((c - 64) % 3) * 5 + 65);
                }
                else if (c >= 'P' && c <= 'T')
                {
                    int temp = c - 64;
                    int sum = 0;
                    while (temp > 0)
                    {
                        sum += temp % 10;
                        temp /= 10;
                    }
                    sum *= 8;
                    encrypt += (char)((sum - 1) % 26 + 65);
                }
                else if (c >= 'U' && c <= 'Z')
                {
                    int temp = c - 64;
                    int factor = temp / 2;
                    while (factor > 0 && temp % factor != 0)
                    {
                        factor--;
                    }
                    factor *= 2;
                    encrypt += (char)((factor - 1) % 26 + 65);
                }
            }
            System.out.println(encrypt);
        }
    }
}
