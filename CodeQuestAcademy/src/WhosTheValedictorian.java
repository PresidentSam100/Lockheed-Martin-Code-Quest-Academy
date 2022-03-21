import java.util.Scanner;
// Problem 30: Who's the Valedictorian
// Difficulty: Easy
// Originally Published: Code Quest 2016
// Code Written By: Sam L.
public class WhosTheValedictorian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            sc.nextLine();
            String school = sc.nextLine();
            int N = sc.nextInt();
            double highestGPA = 0;
            double highestHours = 0;
            String highestName = "";
            for (int j = 0; j < N; j++)
            {
                String student = sc.next();
                String[] info = student.split("[:,]");
                String name = info[0];
                int hours = 0;
                int points = 0;

                for (int k = 1; k < info.length; k++)
                {
                    String temp = info[k];
                    int point = 'E' - temp.charAt(0);
                    int hour = Integer.parseInt(temp.substring(1));
                    points += point * hour;
                    hours += hour;
                }
                double GPA = (double) points / hours;
                if (highestGPA < GPA || highestGPA == GPA && highestHours < hours)
                {
                    highestGPA = GPA;
                    highestName = name;
                    highestHours = hours;
                }
            }
            System.out.println(school + " = " + highestName);
        }
    }
}
