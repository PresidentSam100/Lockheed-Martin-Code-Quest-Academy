import java.util.Scanner;
// Problem 47: Charlie Quebec
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class CharlieQuebec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < N; j++)
            {
                String str = sc.nextLine().toLowerCase();
                String[] s = str.split(" ");
                String ans = "";
                for (int k = 0; k < s.length; k++)
                {
                    for (int l = 0; l < s[k].length(); l++)
                    {
                        if (l != 0)
                        {
                            ans += "-";
                        }
                        switch (s[k].charAt(l))
                        {
                            case 'a':
                                ans += "Alpha";
                                break;
                            case 'b':
                                ans += "Bravo";
                                break;
                            case 'c':
                                ans += "Charlie";
                                break;
                            case 'd':
                                ans += "Delta";
                                break;
                            case 'e':
                                ans += "Echo";
                                break;
                            case 'f':
                                ans += "Foxtrot";
                                break;
                            case 'g':
                                ans += "Golf";
                                break;
                            case 'h':
                                ans += "Hotel";
                                break;
                            case 'i':
                                ans += "India";
                                break;
                            case 'j':
                                ans += "Juliet";
                                break;
                            case 'k':
                                ans += "Kilo";
                                break;
                            case 'l':
                                ans += "Lima";
                                break;
                            case 'm':
                                ans += "Mike";
                                break;
                            case 'n':
                                ans += "November";
                                break;
                            case 'o':
                                ans += "Oscar";
                                break;
                            case 'p':
                                ans += "Papa";
                                break;
                            case 'q':
                                ans += "Quebec";
                                break;
                            case 'r':
                                ans += "Romeo";
                                break;
                            case 's':
                                ans += "Sierra";
                                break;
                            case 't':
                                ans += "Tango";
                                break;
                            case 'u':
                                ans += "Uniform";
                                break;
                            case 'v':
                                ans += "Victor";
                                break;
                            case 'w':
                                ans += "Whiskey";
                                break;
                            case 'x':
                                ans += "Xray";
                                break;
                            case 'y':
                                ans += "Yankee";
                                break;
                            case 'z':
                                ans += "Zulu";
                                break;
                        }
                    }
                    ans += " ";
                }
                System.out.println(ans.trim());
            }
        }
    }
}
