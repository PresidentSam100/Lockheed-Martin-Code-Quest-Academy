import java.util.Scanner;
// Problem 73: Rock, Paper, Scissors
// Difficulty: Easy
// Originally Published: Code Quest 2018
// Code Written By: Sam L.
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            boolean rock = false;
            boolean paper = false;
            boolean scissors = false;
            int rockCount = 0;
            int paperCount = 0;
            int scissorCount = 0;
            for (String check : s)
            {
                switch (check)
                {
                    case "R":
                        rock = true;
                        rockCount++;
                        break;
                    case "P":
                        paper = true;
                        paperCount++;
                        break;
                    case "S":
                        scissors = true;
                        scissorCount++;
                        break;
                }
            }
            if (rock && !paper && scissors && rockCount == 1)
                System.out.println("ROCK");
            else if (rock && paper && !scissors && paperCount == 1)
                System.out.println("PAPER");
            else if (!rock && paper && scissors && scissorCount == 1)
                System.out.println("SCISSORS");
            else
                System.out.println("NO WINNER");
        }
    }
}
