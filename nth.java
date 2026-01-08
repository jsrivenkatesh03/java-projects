import java.util.*;
class nth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
        int op=0;
       for(int i=0;i<ip;i++){
           op=n1;

           n3=n1+n2;
           n1=n2;
           n2=n3;
       }
        System.out.println(op);
    }
}