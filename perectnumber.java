
import java.util.*;

public class perectnumber {

    public static void main(String[] s) {
        /* Enter your code here. Read inargput from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int fact=sc.nextInt();
        int sum=0;
        for(int i=1;i<fact;i++)
        {
            if(fact%i==0)
            {
                sum += i;
            }
        }
        System.out.println(fact==sum?"Yes":"No");
    }
}
