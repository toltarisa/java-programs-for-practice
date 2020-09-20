/**
 * Write a Java function that takes a string and return hashed version.
 * for example : hashString("aaabbbbbccaaaaaaa"); should return a3b5c2a1
 */

public class HashString {

    public static String hashString(String value) {
        String hashed = "";
        int counter = 1;

        for(int i=0;i<value.length();i++) {
            char current = value.charAt(i);

            if(i<value.length() -1 && value.charAt(i+1) == current) {
                counter++;
            }else{
                hashed += String.valueOf(current)+counter;
                counter = 1;
            }
        }

        return hashed;
    }

    public static void main(String[] args) {

        String hashed = hashString("aaabbbbbcca1");
        System.out.println(hashed);
    }
}
