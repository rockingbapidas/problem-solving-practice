package oops;

public class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[0-9a-zA-Z_]";

    public void validate(int count, String[] names) {
        int n = count;
        while (n-- != 0) {
            String userName = names[n];

            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
