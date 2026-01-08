public class aminmax {
    public static void main(String[] args)
    {
        int[] arr={10,34,67,23,9};
        int min=0;
        int max=0;
        for(int i:arr)
        {
            if(max>i)
            {
                max=i;
            }
        }
        for(int j:arr)
        {
            if(j>min)
            {
                min =j;
            }
        }
        
    }
   
    
}
