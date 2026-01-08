import java.util.*;
class strongnumber
{
    static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        return fact;
    }
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int res=0;
        int org=0;
        org=number;
        while(number!=0)
        {
            res=number%10;
            sum += fact(res);
            number=number/10;  
        }
        System.out.println(org==sum?"Strong number":"not a storg number");
    }
}