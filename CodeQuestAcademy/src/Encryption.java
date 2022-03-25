import java.util.Scanner;
// Problem 35: Encryption
// Originally Published: Code Quest 2016
// Difficulty: Medium
// Code Written By: Sam L.
public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String encryptDecrypt = sc.next();
            String cipher = sc.next();
            int N = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < N; j++)
            {
                String message = sc.nextLine();
                String newMessage = "";
                for (int k = 0; k < message.length(); k++)
                {
                    char letter = message.toLowerCase().charAt(k);
                    if (letter == ' ')
                    {
                        newMessage += " ";
                    }
                    else if (encryptDecrypt.equals("ENCRYPT"))
                    {
                        int index = letter - 'a';
                        String temp = cipher.substring(index, index + 1);
                        if (Character.isUpperCase(message.charAt(k)))
                        {
                            temp = temp.toUpperCase();
                        }
                        newMessage += temp;
                    }
                    else if (encryptDecrypt.equals("DECRYPT"))
                    {
                        int index = cipher.indexOf(letter);
                        char temp = (char)('a' + index);
                        if (Character.isUpperCase(message.charAt(k)))
                        {
                            temp -= 32;
                        }
                        newMessage += temp;
                    }
                }
                System.out.println(newMessage);
            }
        }
    }
}
