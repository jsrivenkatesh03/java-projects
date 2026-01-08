class traverse2d
{
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5,6,},{4,7,8}};
        int sum=0;
        int sum1=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // } 
        // for(int[] ele:arr)
        // {
        //     for(int ele1:ele)
        //     {
        //         System.out.print(ele1);
        //     }
        //     System.out.println();
        // }
          for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j)
                {
                 sum += arr[i][j];
                 System.out.print(sum);
                }
                if(i+j==arr.length-1)
                {
                 sum1+= arr[i][j];
                }
            }
            System.out.println();
        } 

    }
}