package skill4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class question3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a date (yyyy-MM-dd): ");
	        String dateStr = sc.nextLine();
	        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
	        System.out.println("Day of the week: " + date.getDayOfWeek());
	    }
}
