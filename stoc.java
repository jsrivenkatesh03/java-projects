public class stoc{
    public static void main(String[] args)
    {
        String s="hello";
        char[] arr=new char[s.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.charAt(i);
        }
        for(char ele:arr)
        {
            System.out.print(ele);
        }

    }    
}
