package Seraching;

public class Binary_Search {

	public int Bi_search(int arr[], int key) {

		int low, high, mid;
		low = 0;
		high = arr.length - 1;
		mid = low + (high - low) / 2;

		while ((arr[mid] != key && low < high)) {
			if (key < arr[mid]) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}

			mid = low + (high - low) / 2;

		}
		if (arr[mid] == key) {
			return mid;
		}

		return -1;

	}

	// array should be sorted first

	public static void main(String[] args) {

		int arr[] = { 34, 14, 4, 50, 11, 67, 7, 80, 90, 100, 101 };

		System.out.println("Array is :");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

		Binary_Search B1 = new Binary_Search();

		System.out.println("\n Element is present at index : " + B1.Bi_search(arr, 100));

	}

}
