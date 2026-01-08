class halfnumber {
      static int count(int n)
      {
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        return c;
    }

     public static void main(String[] args)
     {
        int n=5623;
        int half=count(n)/2;
        int sum=0;int rev=0;
        for(int i=1;i<=half;i++)
        {
           rev=n%10;
           sum += rev;
           n=n/10;
        }
        

     }
    }  

