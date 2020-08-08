package numbersInArray;

import java.util.Random;

public class NumbersInArray {

	public static int[] a = new int[9];

	// Initialized array by random
	public void initArray() {
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	// Sorting array
	public void sortArray() {
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
	public void findNumber(int[] a, int k) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == k) {
					System.out.println(a[i] + " ," + a[j]);
				}

			}

		}
		System.out.print("In array are not numbers wich sum are equal given k");
	}

	// version-2 optimal
	// Find 2 numbers in Array which sum are equal k
	public void findNumber2(int[] a, int k) {
		System.out.println();
		int i = 0;
		int j = a.length - 1;
		while ((a[i] + a[j]) < k) {
			i++;
		}
		while ((a[i] + a[j]) > k) {
			j--;
		}
		if ((a[i] + a[j]) == k) {
			System.out.println(a[i] + " ," + a[j]);
		} else
			System.out.print("In array are not numbers wich sum are equal given k");
	}

	public static void main(String[] args) {
		NumbersInArray find = new NumbersInArray();
		find.initArray();
		find.sortArray();
		// find.findNumber(a,46);
		find.findNumber2(a, 35);

	}
}
