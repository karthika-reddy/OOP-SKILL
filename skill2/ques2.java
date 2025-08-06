package skill2;
import java.util.Scanner;
public class ques2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.print("Enter second string: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());
        System.out.println("StringBuilder 1: " + sb1);
        System.out.println("StringBuilder 2: " + sb2);
        sb2.append(sb1);
        System.out.println("After joining sb1 to sb2:");
        System.out.println("StringBuilder 1 (unchanged): " + sb1);
        System.out.println("StringBuilder 2 (modified): " + sb2);
        sc.close();
}
}
