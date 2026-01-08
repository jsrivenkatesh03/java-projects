import java.util.Scanner;
class oesum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        } 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even += arr[i];
            }
            else
            {
                odd += arr[i];
            }
        }
        System.out.println();
        System.out.println(odd);
        System.out.println(even);
    
    }
}
        
