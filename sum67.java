public class sum13 {
    public static void main(String[] args)
    {
        int[] sumarr={1,2,3,4,13,8,4};
        int sum=0;
        int c1=0;
        int c2=0;
       
        for(int i=0;i<sumarr.length;i++)
        {

            if(sumarr[i]==6)
           {
              c1=i;
           }
           else if(sumarr[i]==7)
           {
            c2=i;
           }
           }
          int res=c2-c1;
        {

        }
        System.out.println(sum);
    }
    
}
