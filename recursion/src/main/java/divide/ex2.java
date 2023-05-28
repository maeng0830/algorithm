package divide;

public class ex2 {

	public static void main(String[] args) {
		int[] array = {2, 1, 6 ,7 ,5 ,8 ,3 ,4};
		int result = logic(array, 0, array.length - 1);
		System.out.println("result = " + result); // 8
	}

	public static int logic(int[] array, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			return array[startIndex];
		}

		int middleIndex = (startIndex + endIndex) / 2;

		return Math.max(logic(array, startIndex, middleIndex), logic(array, middleIndex + 1, endIndex));
	}
}
