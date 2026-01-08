 class duck {
    public static void main(String[] args)
    {
        int n=1234;
        int rev=0;
        while(n!=0)
        {
            rev=n%10;
            if(rev==0)
            {
                break;
            }
            n=n/10;
        }
        System.out.print(rev==0?"duck number":"not a duck number");
    }




}
