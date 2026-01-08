import java.util.Scanner;
public class numbertotext {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=sc.nextInt();
        String res="";
        while(n!=0)
        {
            int rem=n%10;
            res = arr[rem]+res;
            n=n/10;
        }
        System.out.println(res);

    }
    
}
