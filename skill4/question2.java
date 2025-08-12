package skill4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class question2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
	        String birthDateStr = sc.nextLine();
	        LocalDate birthDate = LocalDate.parse(birthDateStr);
	        LocalDate today = LocalDate.now();
	        Period age = Period.between(birthDate, today);
	        System.out.println("You are " + age.getYears() + " years, " 
	                           + age.getMonths() + " months, and " 
	                           + age.getDays() + " days old.");
	        }
}
