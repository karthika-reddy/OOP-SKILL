package skill2;

public class ques3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        sb.insert(5, "is Fun ");
        sb.replace(5, 12, "is Powerful");
        sb.delete(17, 28); 
        sb.reverse();
        int cap = sb.capacity();
        System.out.println("Final StringBuffer content: " + sb);
        System.out.println("Capacity of buffer: " + cap);

	}

}
