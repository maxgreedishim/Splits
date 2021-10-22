import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy {
    private static final String russian = "Москва столица Российской Федерации. Основана в 1147 году";
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("([А-Я][а-я]+)");  // Non-Greedy
        Matcher matcher = pattern.matcher(russian);

        while (matcher.find()) {
            System.out.println(" Вывод --> " + matcher.group());
        }
    }
}