class stringsum
{
    public static void main(Strng[] args)
    {
        String s="hello  hi 23 bye 100 hello 200";
        String[] arr=s.split(" ");
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            String c=arr[i];
             if(s.charAt(0)>='0' && s.charAt(0)<='9')
             {
                int a=Integer.parseInt(c);
                sum=sum+a;
             }
        }
        System.out.print(sum);
    }
}