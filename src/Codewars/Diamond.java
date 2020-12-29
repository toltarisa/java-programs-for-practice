package Codewars;

public class Diamond {

    public static String print(int n) {
       if(n%2 == 0 || n <=0) return null;

       StringBuilder diamond = new StringBuilder();
       for(int i=1;i<n;i+=2) {
           diamond.append(" ".repeat(Math.max(0, (n - i) / 2)));
           diamond.append("*".repeat(Math.max(0, i)));
           diamond.append("\n");
       }

       for(int i =n; i>0;i-=2) {
           diamond.append(" ".repeat(Math.max(0, (n - i) / 2)));
           diamond.append("*".repeat(Math.max(0, i)));
           diamond.append("\n");
       }

       return diamond.toString();
    }

    public static void main(String[] args) {
        int test = 5;
        String result = print(test);
        System.out.println(result);

    }
}
