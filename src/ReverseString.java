public class ReverseString {

    public static void main(String[] args) {
        String value = reverseString("isatoltar");
        System.out.println(value);
    }

    public static String reverseString (String value) {
        char[] letters = new char[value.length()];

        int letterIndex = 0;
        for (int i = value.length() -1 ; i >= 0; i--) {
            letters[letterIndex] = value.charAt(i);
            letterIndex++;
        }

        String reversedString = "";

        for (int i = 0 ; i < value.length(); i++) {
            reversedString += letters[i];
        }
        return reversedString;
    }
}
