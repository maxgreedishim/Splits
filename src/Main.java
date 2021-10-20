import java.util.regex.*;

public class Main {

    private static final String english = "London is the capital of Great Britain.";
    private static final String russian = "Москва столица Российской Федерации. Основана в 1147 году";

    public static void main(String[] args) {
        Pattern pEng = Pattern.compile("([A-Z][a-z]+)"); //.* Любое колличество любых символов.
        Matcher mEng = pEng.matcher(english);
        Pattern pRus = Pattern.compile("([А-Я][а-я]+).*([0-9]{4})"); //.* Любое колличество любых символов.
        Matcher mRus = pRus.matcher(russian);

       /* System.out.println(mEng.matches() ? "Найдено" : "Не найдено");
        System.out.println(mRus.matches() ? "Найдено" : "Не найдено");
        System.out.println(mEng.group(1));
        System.out.println(mRus.group(1));*/

        while (mEng.find()) {
            System.out.println(mEng.group(1));
        }

        while (mRus.find()) {
            System.out.println(mRus.group(1));
            System.out.println(mRus.group(2));
        }
    }
}
