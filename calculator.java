import java.util.*;
class calculator
{
    static int add(int n1,int n2)
    {
        return n1+n2;
    }
    static int sub(int n1,int n2)
    {
        return n1-n2;
    }
    static int mul(int n1,int n2)
    {
        return n1*n2;
    }
    static int div(int n1,int n2)
    {
        return n1/n2;
    }
    static int mod(int n1,int n2)
    {
        return n1%n2;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========calculator===========");
        while(true)
        {
            System.out.println("=========menu=======");
            System.out.println("1.add/n2.sub/n3.mul/n4.div/n5.mod/n6.exit");
            int op=sc.nextInt();
            if(op<6)
            {
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                switch(op)
                {
                    case 1:System.out.println("addition of numbers is" + add(n1,n2));break;
                    case 2:System.out.println("subration of numbers is" + sub(n1,n2));break;
                    case 3:System.out.println("multipulation of numbers is" + mul(n1,n2));break;
                    case 4:System.out.println("division of numbers is" + div(n1,n2));break;
                    case 5:System.out.println("modulo of numbers is" +mod(n1,n2));break;
                    case 6:System.out.println("thank you");
                           System.exit(0);
                    default:System.out.println("invaild option"
                    
                    
                }
            }

        }
    }
}