import java.util.regex.*;

public class Phone {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("\\(?\\d{3}\\)?([-\\/\\.\\,])\\d{3,5}\\1(\\d{4})");
        Pattern p = Pattern.compile("(-)(\\d+)(-)");
        Matcher m = p.matcher("456--123----7890");
        while (m.find()) {
            System.out.println(m.group(3));
            //System.out.println(m.group(2));
       }
    }
}
