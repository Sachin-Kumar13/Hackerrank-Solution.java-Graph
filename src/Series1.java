import java.io.*;
import java.util.*;
//series =7,15,32,67,....
class Solution {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        int s = 7;

        for(int i=1;i<n;i++) {
            if(i<n)
            {

            s = s * 2 + i;
        }
        }
        System.out.println(s);
    }
}