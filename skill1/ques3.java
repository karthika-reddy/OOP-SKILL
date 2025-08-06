package skill1;

public class ques3 {

	public static void main(String[] args) {
		int a = 10;
        double b = 5.5;
        Integer aObj = a;
        Double bObj = b;
        System.out.println("Integer object: " + aObj);
        System.out.println("Double object: " + bObj);
        int newA = aObj;
        double newB = bObj;
        System.out.println("Unboxed int: " + newA);
        System.out.println("Unboxed double: " + newB);

	}

}
