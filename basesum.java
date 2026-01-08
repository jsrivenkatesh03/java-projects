class basesum
{
    static int power(int base,int ex)
    {
        int result=1;
        for(int i=1;i<=ex;i++)
        {
          result=result*base;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int n=436;
        int sum=0;
        int rev=0;

        while(n!=0)
        {
            rev=n%10;
            sum=sum+power(rev,3);
            n=n/10;
        }
        System.out.println(sum);
    }
}
