
import java.util.*;
import java.math.*;
class Solution1
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a =1,sum=0;
        for (int i =1;i<n+1;i++)
        {
            sum=a+i*i*i*i;
            a=sum;

        }
        System.out.println(sum-1);
    }
}
