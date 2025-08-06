package skill1;
import java.util.*;
public class ques2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double numDouble = sc.nextDouble();
        int numInt = (int) numDouble; 
        System.out.println("Original double value: " + numDouble);
        System.out.println("After narrowing to int: " + numInt);
        sc.close();
	}
}
