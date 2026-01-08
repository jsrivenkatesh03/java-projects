import java.util.*;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s.toUpperCase();
        String s2 = "";
        int sum = 0;

        String[] arr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", 
                        "1010", "1011", "1100", "1101", "1110", "1111"};
        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= '0' && c <= '9') 
            {
                s2 += arr[c - '0'];
            } 
            else if (c >= 'A' && c <= 'F') 
            {
                s2 += arr[c - 'A' + 10];
            }
        }
        
        for (int i = 0; i < s2.length(); i++) {
            char a = s2.charAt(i);
            if (a == '1') {
                sum++;
            }
        }
        
        System.out.print(sum);
    }
}
