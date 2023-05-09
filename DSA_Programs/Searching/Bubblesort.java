package DSA_Programs.Searching;

//Completed
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 78, 8, 56, 1, 9, 10, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
