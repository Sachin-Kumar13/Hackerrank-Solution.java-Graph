import java.io.*;
import java.util.*;

class SalesGraph
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();

        for(int i=0;i<tc;i++)
        {
            int n = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<n;j++)
                a.add(in.nextInt());

            int max = Collections.max(a);
            String m[][] = new String[max][n];

            for(int u=0;u<max;u++)
                for(int v=0;v<n;v++)
                    m[u][v] = "  ";

            for(int x=0;x<n;x++)
            {
                int temp = a.get(x);
                for(int y=max-1;y>=max-temp;y--)
                {
                    m[y][x] = "| ";
                }
            }

            System.out.println(max);
            for(String p[] : m)
            {
                for(String q : p)
                {
                    System.out.print(q);
                }
                System.out.println();
            }
        }
    }
}