import java.util.*;
public class minmax{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int max=0;
      int min=0;
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
      for(int i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length-1;j++)
        {
          if(arr[i]>arr[j])
          {
            max=arr[i];
          }
          else
          {
            max=arr[j];
          }
        }
        for(int j=i+1;j<arr.length-1;j++)
        {
          if(arr[i]<arr[j])
          {
            min=arr[i];
          }
          else
          {
            max=arr[j];
          }
        }
      }
      System.out.println();
     System.out.println("the maximum elemeant is"+max); 
     System.out.println("the maximum elemeant is"+min); 

    

      

      

    }
    
}
