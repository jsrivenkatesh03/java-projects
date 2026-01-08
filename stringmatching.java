import java.util.regex.Pattern;
class stringmatching{
    public static void main(String[] args)
    {
        String s="sabari####@gmail.com";
        String reg="[A-Z,a-z]{1-5}#*@gmail[.]com";
        System.out.print(Pattern.matches(reg ,s));

        
    }
}