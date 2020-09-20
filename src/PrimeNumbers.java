import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start : ");
        int start = sc.nextInt();
        System.out.println("Enter end : ");
        int end = sc.nextInt();

        System.out.println(findPrimeNumbers(start,end));
    }

    public static ArrayList<Integer> findPrimeNumbers(int start, int end){

        ArrayList<Integer> primes = new ArrayList<>();

        for(int n = start; n < end; n++) {
            boolean prime = true;
            int i = 2;
            while(i <= n / 2) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

            if(prime) {
                primes.add(n);
            }
        }

        return primes;
    }
}
