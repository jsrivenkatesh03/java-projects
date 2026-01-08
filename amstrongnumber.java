class amstrongnumber
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
        int n=1634;
        int sum=0;
        int count=0;
        
        int n1=n;
        int n2=n;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        while(n1!=0)
        {
            int rev1=n1%10;
            sum=sum+power(rev1,count);
            n1=n1/10;
        }
       System.out.println(n2==sum?"amstroung number":"not a amstroung number");
      
    }
}