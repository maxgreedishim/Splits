import java.util.regex.*;

public class Main {

    private static final String english = "London is the capital of Great Britain.";
    private static final String russian = "Москва столица Российской Федерации.";

    public static void main(String[] args) {
        Pattern pEng = Pattern.compile(".*([A-Z][a-z]+).*"); //.* Любое колличество любых символов.
        Matcher mEng = pEng.matcher(english);
        System.out.println(mEng.matches() ? "Найдено" : "Не найдено");
        Pattern pRus = Pattern.compile(".*([А-Я][а-я]+).*"); //.* Любое колличество любых символов.
        Matcher mRus = pRus.matcher(russian);
        System.out.println(mRus.matches() ? "Найдено" : "Не найдено");
        System.out.println(mEng.group(1));
        System.out.println(mRus.group(1));
        /*while (mEng.find()) {
            System.out.println(mEng.group(1));
        }*/

    }
}
