package recurrence_relation;

public class ex4 {

	public static void main(String[] args) {
		int result = fibonacci(5);
		System.out.println("result = " + result);
	}

	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		}

		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
