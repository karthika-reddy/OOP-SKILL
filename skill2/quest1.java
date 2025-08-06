package skill2;
import java.util.Scanner;

public class quest1 {
	 public static void main(String[] args) {
		 char[] charArray = {'H', 'e', 'l', 'l', 'o'};
	 
	        String str1;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        str1 = sc.nextLine();
	        System.out.println("Character Array as String: " + new String(charArray));
	        System.out.println("Entered String: " + str1);
	        String strFromCharArray = new String(charArray);
	        System.out.println("Converted String from char array: " + strFromCharArray);

	        sc.close();
}
}
