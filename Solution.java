
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        if(n<=2){
            sum=25;
             }
        else if(n>=2&&n<=7)
        {
            int var=25;
            int km=n-2;
            sum=km*15+var;
        }
        else if(n>=7&&n<=12)
        {
            int var=100;
            int km=n-7;
            sum=km*20+var;
        }
        else
        {
            int var=200;
            int km =n-12;
            sum=km*25+var;
        }
        System.out.println(sum);
    }
}