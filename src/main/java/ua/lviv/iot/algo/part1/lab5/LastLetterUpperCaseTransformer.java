package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetterUpperCaseTransformer {
    public String transformText(String var1) {
        Pattern pattern = Pattern.compile("\\b(\\w*)(\\w)\\b");
        Matcher matcher = pattern.matcher(var1);
        StringBuilder builder = new StringBuilder();

        while (matcher.find()) {
            String group = matcher.group(1);
            char upperCase = Character.toUpperCase(matcher.group(2).charAt(0));
            matcher.appendReplacement(builder, group + upperCase);
        }

        matcher.appendTail(builder);
        return builder.toString();
    }

    public static void main(String[] var0) {
        LastLetterUpperCaseTransformer transformer = new LastLetterUpperCaseTransformer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String inputText = scanner.nextLine();
        String result = transformer.transformText(inputText);
        System.out.println(result);
    }
}
