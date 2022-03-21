import java.util.Scanner;
// Problem 75: Space Station Repair Lights
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class SpaceStationRepairLights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String ans = "";
            for (int j = 0; j < 2; j++)
            {
                String a = sc.next();
                String b = sc.next();
                if (a.equals("WORKING") && b.equals("WORKING"))
                {
                    ans += "off ";
                }
                else if (a.equals("WORKING") && b.equals("BROKEN"))
                {
                    ans += "red ";
                }
                else if (a.equals("BROKEN") && b.equals("WORKING"))
                {
                    ans += "green ";
                }
                else if (a.equals("BROKEN") && b.equals("BROKEN"))
                {
                    ans += "blue ";
                }
            }
            System.out.println(ans.trim());
        }
    }
}
