import java.io.*;
import java.util.*;
//Program to find Nth term of series 0, 7, 18, 33, 52, 75, 102, 133,...
public class Series3 {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=7,c=0;
        for(int i =0;i<n-1;i++)
        {
            a=a+b+c;
            c+=4;

        }
        System.out.println(a);
    }
}