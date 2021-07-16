import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator{

    public static void main(String[] args) {
        LocalDate today =  LocalDate.now();
        LocalDate birthDate = LocalDate.of(2000,5,27);
        int years = Period.between(birthDate, today).getYears();
        System.out.println(years); // age 
        System.out.println(today); // Today's Date
        System.out.println(birthDate); // My birthday 

    }
}