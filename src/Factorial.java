import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(factorial(number));
    }

    static int factorial(int n) {
        if(n == 1) {
            return 1;
        }else {
            return n * factorial(n -1 );
        }
    }
}
