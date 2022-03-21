import java.util.Scanner;
// Hello World
// Solution from Code Quest Academy
// Sam L.
public class Prob00 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {
                System.out.println(input.nextLine());
            }
        }
    }
}