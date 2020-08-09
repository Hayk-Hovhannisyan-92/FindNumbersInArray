package numbersInArray;

import java.util.Random;

public class NumbersInArray {

	public static int[] a = new int[9];

	// Initialized array by random
	public static void initArray() {
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	// Sorting array
	public static void sortArray() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
			System.out.print(a[i] + " ");
		}
	}

	// version-1 non-optimal
	// Find 2 numbers in Array which sum are equal k
	public static boolean findNumber(int[] a, int k) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == k) {
					return true;
				}

			}

		}
		return false;
	}

	// version-2 optimal
	// Find 2 numbers in Array which sum are equal k
	public static boolean findNumber2(int[] a, int k) {
		System.out.println();
		int i = 0;
		int j = a.length - 1;
		while (i<j && (a[i] + a[j]) < k) {
			i++;
		}
		while (j<i &&(a[i] + a[j]) > k) {
			j--;
		}
		return ((a[i] + a[j]) == k);
	}

	public static void main(String[] args) {
		initArray();
		sortArray();
		//find.findNumber(a,46);
		findNumber2(a,38);

	}
}
