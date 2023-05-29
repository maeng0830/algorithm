package recursion.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2750
public class b2_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		splitAndMerge(array, 0, array.length - 1);

		for (int i : array) {
			System.out.println("i = " + i);
		}
	}

	public static void splitAndMerge(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex == rightIndex) {
			return;
		}

		int middleIndex = (leftIndex + rightIndex) / 2;

		splitAndMerge(array, leftIndex, middleIndex);
		splitAndMerge(array, middleIndex + 1, rightIndex);
		merge(array, leftIndex, middleIndex, rightIndex);
	}

	public static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
		int lIdx = leftIndex;
		int rIdx = middleIndex + 1;
		int idx = leftIndex;

		int[] tmp = new int[rightIndex + 1];

		while (lIdx <= middleIndex && rIdx <= rightIndex) {
			if (array[lIdx] <= array[rIdx]) {
				tmp[idx++] = array[lIdx++];
			} else {
				tmp[idx++] = array[rIdx++];
			}
		}

		if (lIdx > middleIndex) {
			for (int i = rIdx; i <= rightIndex; i++) {
				tmp[idx++] = array[i];
			}
		}

		if (rIdx > rightIndex) {
			for (int i = lIdx; i <= middleIndex; i++) {
				tmp[idx++] = array[i];
			}
		}

		for (int i = leftIndex; i <= rightIndex; i++) {
			array[i] = tmp[i];
		}
	}
}
