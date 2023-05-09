package DSA_Programs.Searching;

import java.awt.image.BufferStrategy;

public class Binarysearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 4, 8, 9, 10 };
		int target = 3;

//		System.out.println(binSearchRec(arr, target, 0, arr.length - 1));
		
		System.out.println(binSearch(arr, target));

	}

	//Normal method 
	static int binSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start;
	}

	// recursive method
	static int binSearchRec(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}
		// Important formula
		int mid = start + (end - start) / 2;

		if (target == arr[mid]) {
			return mid;
		} else if (target < arr[mid]) {
			return binSearchRec(arr, target, start, mid - 1);
		} else {
			return binSearchRec(arr, target, mid + 1, end);
		}

	}

}
