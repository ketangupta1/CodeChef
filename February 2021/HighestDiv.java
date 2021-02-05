//You are given an integer N. Find the largest integer between 1 and 10 (inclusive) which divides N.

import java.util.*;
public class HighestDiv{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int k=0;
        if(n>10)
        {
             for(int i=10;i>=1;i--)
        {
            if(n%i==0)
            {
                k=i;
                break;
            }
        }
        }
        else{
             k=n;
            }
        System.out.print(k);
    }
}
