import java.util.Scanner;
// Problem 64: Hidden Messages
// Originally Published: Code Quest 2017
// Difficulty: Easy
// Code Written By: Sam L.
public class HiddenMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String decoding = sc.nextLine();
        for (int i = 1; i < T; i++)
        {
            String str = sc.nextLine();
            String[] message = str.split(" ");
            String ans = "";
            for (int j = 0; j < message.length; j++)
            {
                String[] wordArr = message[j].split("-");
                String word = "";
                for (int k = 0; k < wordArr.length; k++)
                {
                    int num = Integer.parseInt(wordArr[k]);
                    word += decoding.substring(num - 1, num);
                }
                ans += word + " ";
            }
            System.out.println(ans.trim());
        }
    }
}
