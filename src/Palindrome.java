import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        original = original.replace(" ","");

        String reversed = "";

        for(int i=original.length()-1;i>=0; i--){
            reversed += original.charAt(i);
        }

        boolean isPalindrome = true;

        for(int i=0; i< original.length(); i++) {
            if(original.charAt(i) != reversed.charAt(i)) {
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome ");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
