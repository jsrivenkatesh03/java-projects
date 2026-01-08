import java.util.*;
class middlearray
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    {
        if(i%2==1)
        {  
            if(arr[i-1]<arr[i])
            {
            int temp = arr[i-1];
            arr[i-1]=arr[i];
            arr[i]= temp;
            }
        }
      
    }

    for(int ele:arr)
    {
        System.out.print(ele+" ");
    }

}


}