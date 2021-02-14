package Codewars;

public class NumberOfTrailingZeros {

    public static int zeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        int countOfZeros = zeros(25);
        System.out.println(countOfZeros);
    }
}
