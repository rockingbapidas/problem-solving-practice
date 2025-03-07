package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

    public void checkEmail(String[] arr) {
        List<String> names = new ArrayList<>();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        for (String s : arr) {
            String[] firstNameEmailID = s.split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()) {
                names.add(firstName);
            }
        }

        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).compareTo(names.get(j)) > 0) {
                    String temp = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j, temp);
                }
            }
        }

        for (String string : names) {
            System.out.println(string);
        }
    }
}
