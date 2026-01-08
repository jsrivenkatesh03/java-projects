import java.util.*;
class reversearray
{
    public static int[] reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("before swaping");
        for(int i=0;i<arr.length;i++)
        {
        
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("After swaping");
        for(int i=0;i<arr.length;i++)
        {
       
            System.out.print(arr[i]+" ");
        }


    }
}