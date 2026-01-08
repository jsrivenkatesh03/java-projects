 import java.util.Scanner;
 class min {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int min=5;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++)
        {
            if(min > arr[j])
            {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
