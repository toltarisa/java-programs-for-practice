package Codewars;

public class Prime {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int test = 17;
        Boolean result = isPrime(test);
        System.out.println(result);
    }
}
