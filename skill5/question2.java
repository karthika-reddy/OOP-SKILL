package skill5;
import java.util.Scanner;

public class question2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter value to search: ");
	        int key = sc.nextInt();

	        int count = 0;
	        for (int num : arr) {
	            if (num == key) {
	                count++;
	            }
	        }
	        if (count > 0) {
	            System.out.println(key + " is present " + count + " times in the array.");
	        } else {
	            System.out.println(key + " is not found in the array.");
	        }
	    }
}
