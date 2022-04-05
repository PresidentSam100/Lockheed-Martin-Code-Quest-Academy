import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Problem 82: Peoplebook
// Originally Published: Code Quest 2018
// Difficulty: Medium
// Code Written By: Sam L.
public class Peoplebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            String str = sc.next();
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> profiles = new ArrayList<>();
            str = str.replaceAll("[\\[\\]]","");
            String[] s = str.split(",");
            for (int j = 0; j < N; j++)
            {
                String name = s[j];
                String age = s[j + N];
                String instagram = s[j + 2 * N];
                String twitter = s[j + 3 * N];
                String phone = s[j + 4 * N];
                String email = s[j + 5 * N];
                String profile = "Name: " + name + "\n" +
                                 "Age: " + age + "\n" +
                                 "Instagram: " + instagram + "\n" +
                                 "Twitter: " + twitter + "\n" +
                                 "Phone: " + phone + "\n" +
                                 "Email: " + email;
                names.add(name);
                profiles.add(profile);
            }
            for (int j = 0; j < N; j++)
            {
                String person = sc.next();
                int index = names.indexOf(person);
                System.out.println(profiles.get(index));
            }
        }
    }
}
/*
2
        2
        [[Alice,Bob],[15,16],[aliceInsta,BobIsCool1],[@wonderland,@bobbyBoy],[1234567890,4078675309],[alice123@gmail.com,bobsEmail@yahoo.com]]
        Alice
        Bob
        2
        [[Joe,Eve],[32,45],[AverageJoe,DropperOfEves],[@shoeless,@eve123],[8374629401,3849502837],[joeabc123@orange.co.uk,eve@army.us.mil]]
        Eve
Joe
*/