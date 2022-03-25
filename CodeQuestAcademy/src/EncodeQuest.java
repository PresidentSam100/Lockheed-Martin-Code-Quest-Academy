import java.util.Scanner;
// Problem 50: Encode Quest
// Originally Published: Code Quest 2017
// Difficulty: Medium
// Code Written By: Sam L.
public class EncodeQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String line = sc.nextLine();
            String keyword = sc.nextLine();
            String encrypt = "";
            int spaces = 0;
            for (int j = 0; j < line.length(); j++)
            {
                if (line.charAt(j) == ' ')
                {
                    spaces++;
                    encrypt += " ";
                    continue;
                }
                int index = line.charAt(j) - 'A';
                char encode = (char)(((keyword.charAt((j - spaces) % keyword.length())) + index - 'A') % 26 + 'A');
                encrypt += encode;
            }
            System.out.println(encrypt);
        }
    }
}
