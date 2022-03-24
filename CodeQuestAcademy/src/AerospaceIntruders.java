import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Problem 17: Aerospace Intruders
// Difficulty: Medium
// Originally Published: Code Quest 2015
// Code Written By: Sam L.
public class AerospaceIntruders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            ArrayList<alienShip> arr = new ArrayList<>();
            for (int j = 0; j < N; j++)
            {
                String str = sc.next();
                String[] s = str.split("[_:,]");
                alienShip as = new alienShip(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                arr.add(as);
            }
            while (!arr.isEmpty())
            {
                Collections.sort(arr, new comp());
                System.out.println(arr.remove(0));
                for (int j = 0; j < arr.size(); j++)
                {
                    arr.get(j).changeX();
                }
            }
        }
    }
    static class alienShip
    {
        private String shipName;
        private String shipClass;
        private int x;
        private int y;

        public alienShip(String shipName, String shipClass, int x, int y)
        {
            this.shipName = shipName;
            this.shipClass = shipClass;
            this.x = x;
            this.y = y;
        }

        public void changeX()
        {
            if (shipClass.equals("A"))
            {
                x -= 10;
            }
            else if (shipClass.equals("B"))
            {
                x -= 20;
            }
            else if (shipClass.equals("C"))
            {
                x -= 30;
            }
        }

        public String toString()
        {
            return "Destroyed Ship: " + shipName + " xLoc: " + x;
        }

    }
    static class comp implements Comparator<alienShip>
    {
        @Override
        public int compare(alienShip a1, alienShip a2)
        {
            if (a1.x < a2.x)
                return -1;
            else if (a1.x > a2.x)
                return 1;
            else
                return -Integer.compare(a1.y, a2.y);
        }
    }
}
