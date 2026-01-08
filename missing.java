import java.util.Scanner;
public class missing 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
         int sum1=0;
          int sum=0;    
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sp=arr[0];
        int end=arr[arr.length-1];   
        for(int j=sp;j<=end;j++)
        {
            sum+=j;
        }

        for(int i=0;i<arr.length;i++)
        {
            sum1 += arr[i]; 
        }
        
               System.out.println(sum-sum1);


    }
    
}
