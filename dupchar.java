public class dupchar {
    public static void main(String[] args)
    {
        String s="hello";
        int[] arr=new int[128];
        for(int i=0;i<s.length();i++)
        {
           arr[s.charAt(i)]++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>1)
            {
                System.out.println((char)(j)+" "+arr[j]);
            }
        }
    }
    
}
