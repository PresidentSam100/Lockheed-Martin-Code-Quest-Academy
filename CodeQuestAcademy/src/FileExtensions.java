import java.util.*;
// Problem 63: File Extensions
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class FileExtensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<String> extensions = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            String extension = s.substring(s.lastIndexOf(".") + 1);
            if (extensions.contains(extension))
            {
                counts.set(extensions.indexOf(extension), counts.get(extensions.indexOf(extension)) + 1);
            }
            else
            {
                extensions.add(extension);
                counts.add(1);
            }
        }
        for (int i = 0; i < extensions.size(); i++)
        {
            System.out.println(extensions.get(i) + " " + counts.get(i));
        }
    }
}
