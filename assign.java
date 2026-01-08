import java.util.*;
public class assign {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int n=sc.nextInt();
         int n1=n;
         int res;
         char c;
        String output="";
         int count=0;
         while(n!=0)
         {
            count++;
            n=n/10;
         }
         int[] arr=new int[count];
         while(n1!=0)
         {
             res=n1%10;
             arr[--count]=res;
              n1=n1/10;
          }
         for(int j=0;j<arr.length;j++)
         {  
           if(arr[j]<s.length())
            { 
                c=s.charAt(arr[j]);
               if((arr[j]%2==0) && ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O'|| c=='U'))
               {
                 output = output + "@";
               }
               else
               {
                 output = output + s.charAt(arr[j]);
               }
            }
            else
            {
                output = output+"#";
            }
         }

        System.out.println("output is: "+output);
    }
}
