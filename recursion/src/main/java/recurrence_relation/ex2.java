package recurrence_relation;

public class ex2 {

	public static void main(String[] args) {
		int result = sigma(16, 1, 0);
		System.out.println("result = " + result);
	}

	// 공을 n 높이에서 떨어뜨렸을 때, 튀어 오르는 높이는 떨어뜨린 높이의 1/2이다.
	// 튀어 오르는 높이가 end 미만일 때까지의 공의 총 이동거리는 무엇인가?
	public static int sigma(int n, int end, int curValue) {
		if (n < end) {
			return curValue;
		}

		if (curValue == 0) {
			curValue = curValue + n;
		} else {
			curValue = curValue + 2 * n;
		}

		System.out.println("curValue = " + curValue);

		return sigma(n / 2, end, curValue);
	}
}
