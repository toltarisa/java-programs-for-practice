import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999,4,6);

        int years = Period.between(birthday,today).getYears();
        System.out.println("Today : "+today);
        System.out.println("Birthday : "+birthday);
        System.out.println("Age : "+years);

    }
}
