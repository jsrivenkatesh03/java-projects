import java.util.Scanner;

public class primesum {
     
    static boolean isprime(int n)
    {
        boolean flag=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ARR SIZE");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int notprimesum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(isprime(arr[i])==false)
            {
               sum=sum+arr[i] ;
            }
           else{
            notprimesum=notprimesum+arr[i];
           }
        }   
       
        System.out.println(sum);
        System.out.println(notprimesum);
    }
}