import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // BIG DECIMAL
        System.out.println(1.2 - 1.0);

        BigDecimal bd1 = new BigDecimal("1.21235");
        BigDecimal bd2 = new BigDecimal("5.4325235664");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));

        System.out.println("-".repeat(30));

        // DATE/TIME
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String newNow = now.format(formatter);
        System.out.println(newNow);

        LocalDateTime futureDate = LocalDateTime.of(2027, 3, 22, 12, 0, 0);
        System.out.println(futureDate);

        if (now.isBefore(futureDate)){
            System.out.println(now + " is before " + futureDate);
        }else {
            System.out.println(now + " is after " + futureDate);
        }


    }
}