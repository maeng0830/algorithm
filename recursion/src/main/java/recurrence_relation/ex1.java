package recurrence_relation;

public class ex1 {

	public static void main(String[] args) {
		int result = sigma(1, 5, 0);

		System.out.println("result = " + result);
//		curValue = 1
//		curValue = 3
//		curValue = 6
//		curValue = 10
//		curValue = 15
//		result = 15
	}

	public static int sigma(int n, int end, int curValue) {
		if (end < n) {
			return curValue;
		}

		curValue = curValue	+ n;
		System.out.println("curValue = " + curValue);

		return sigma(n + 1, end, curValue);
	}
}
