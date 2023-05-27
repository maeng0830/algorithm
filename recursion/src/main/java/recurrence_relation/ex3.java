package recurrence_relation;

public class ex3 {

	public static void main(String[] args) {
		int result = fibonacci(1, 5, 0, 0);
		System.out.println("result = " + result);
//		twoPrevValue = 0
//		onePrevValue = 0
//		curValue = 1
//		===============================
//		twoPrevValue = 0
//		onePrevValue = 1
//		curValue = 1
//		===============================
//		twoPrevValue = 1
//		onePrevValue = 1
//		curValue = 2
//		===============================
//		twoPrevValue = 1
//		onePrevValue = 2
//		curValue = 3
//		===============================
//		twoPrevValue = 2
//		onePrevValue = 3
//		curValue = 5
//		===============================
//		result = 5
	}

	public static int fibonacci(int n, int end, int twoPrevValue, int onePrevValue) {
		if (end < n) {
			return onePrevValue;
		}

		int curValue = 0;

		if (n <= 2) {
			curValue = 1;
		} else  {
			curValue = twoPrevValue + onePrevValue;
		}

		System.out.println("twoPrevValue = " + twoPrevValue);
		System.out.println("onePrevValue = " + onePrevValue);
		System.out.println("curValue = " + curValue);
		System.out.println("===============================");

		return fibonacci(n + 1, end, onePrevValue, curValue);
	}
}
