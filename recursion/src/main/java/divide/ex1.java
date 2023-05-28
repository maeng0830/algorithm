package divide;

public class ex1 {

	public static void main(String[] args) {
		int[] array = {4, 2, 5, 1, 5, 3, 1, 2};
		int result = logic(array, 0, array.length - 1);
		System.out.println(result); // 23
	}

	public static int logic(int[] array, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			return array[startIndex];
		}

		int middleIndex = (startIndex + endIndex) / 2;

		return logic(array, startIndex, middleIndex) + logic(array, middleIndex + 1, endIndex);
	}
}
