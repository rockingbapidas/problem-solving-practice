public class RotationalCipher {
    public String rotationalCipher(String input, int rotationFactor) {
        char[] arr = input.toCharArray();

        String result = "";

        for (char ch : arr) {
            if (ch >= 'a' && ch <= 'z') {
                char alphabet = (char) (ch + rotationFactor);
                if (alphabet > 'z') {
                    alphabet = (char) ((alphabet - 97) % 26 + 97);
                }
                result = result.concat(Character.toString(alphabet));
            } else if (ch >= 'A' && ch <= 'Z') {
                char alphabet = (char) (ch + rotationFactor);
                if (alphabet > 'Z') {
                    alphabet = (char) ((alphabet - 65) % 26 + 65);
                }
                result = result.concat(Character.toString(alphabet));
            } else if (ch >= '0' && ch <= '9') {
                int number = Integer.parseInt(String.valueOf(ch)) + rotationFactor;
                if (number > 9) {
                    number = number % 10;
                }
                result = result.concat(String.valueOf(number));
            } else {
                result = result.concat(String.valueOf(ch));
            }
        }

        return result;
    }
}
