class anagram
{
    static String sort(char[] c1)
    {
        for(int i=0;i<c1.length;i++)
        {
            for(int j=0;j<c1.length-1;j++)
            {
                
                if(c1[j]>c1[j+1])
                {
                    char temp=c1[j];
                    c1[j]=c1[j+1];
                    c1[j+1]=temp;
                }
            }
        }
        return new String(c1);
    }
    public static void main(String[] args)
    {
        String s1="hello";
        String s2="lehlosdf";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        String s3=sort(c1);
        String s4=sort(c2);

        if(s3.equals(s4))
        {
            System.out.print("its a anagram");
        }
        else
        {
            System.out.print("its a anagram not");
        }
       
        
    }
       
    }
