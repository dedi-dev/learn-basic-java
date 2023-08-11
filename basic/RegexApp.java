package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Syaif Azmi Abdullah";
        Pattern pattern = Pattern.compile("[a-zA-z]*[a][a-zA-z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
