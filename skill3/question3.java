package skill3;
import java.util.Scanner;
public class question3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        if (sqrt == (int) sqrt) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

        sc.close();
    }
}
