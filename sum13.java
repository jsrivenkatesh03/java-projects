public class sum13 {
    public static void main(String[] args)
    {
        int[] sumarr={1,2,3,4,13,8,4};
        int sum=0;
       
        for(int i=0;i<sumarr.length;i++)
        {
            if(sumarr[i]==13)
           {
            
             i++;
             continue;
           }

           sum+=sumarr[i];
        }
        System.out.println(sum);
    }
    
}
