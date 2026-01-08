public class panagram {
    public static void main(String[] args) {
        String s="ABCDEFGHIJKLMNOPqraez";
        String s1=s.toUpperCase();
        String s3="";
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(s3.indexOf(c)==-1)
            {
               s3 += s1.charAt(i);
            }
        }

        int[] arr=new int[128];
        for(int i=0;i<s3.length();i++)
        {
            
            arr[s3.charAt(i)]++;
        }
        for (int i = 0; i < arr.length; i++) 
        {
           if(i>=65 && i<=90)
           {
             sum += arr[i];
           }
            
        }
        if(sum==26)
        {
            System.out.println("panagram");

        }
        else
        {
            System.out.println(" not panagram");
        }
    }
    
}
