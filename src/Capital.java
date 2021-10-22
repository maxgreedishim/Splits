import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capital {

    private static final String russian = "Москва столица Российской Федерации. Основана в 1147 году";
    private static final Pattern pattern = Pattern.compile("[А-Яа-я]+.*?[0-9]+");
    private static final Matcher matcher = pattern.matcher(russian);

    public static void main(String[] args) {
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
