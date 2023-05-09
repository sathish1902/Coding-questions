package codingQuestions;


public class PrintLetterByInputStr {
	 public static void main(String[] args) {

	        int n = 6;
	        int[][] arr = new int[(2*n) - 1][(2*n) - 1];
	        for (int i = 0; i < n; i++) {
	            for(int j = i; j < (2 * n) - 1 - i; j++) {
	                arr[i][j] = n - i;
	                arr[(2 * n) - 1 - i - 1][j] = n - i;
	            }
	            for(int k = i; k < (2 * n) - 1 - i; k++) {
	                arr[k][i] = n - i;
	                arr[k][(2 * n) - 1 - i - 1] = n - i;
	            }
	        }
	        for(int i = 0; i < (2 * n) - 1; i++) {
	            for(int j = 0; j < (2 * n) - 1; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}



