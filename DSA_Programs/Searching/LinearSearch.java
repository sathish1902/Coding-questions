package DSA_Programs.Searching;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = new int[] {8, 3, 4, 32,43,-3,87, 5, 76};
		
		System.out.println(linearSearch(arr, -3));
	}

	public static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == target) {
				return index;
			}
		}

		// item not found in the list
		return -1;
	}

}
