package codingQuestions;

//Given an integer numRows, return the first numRows of Pascal's triangle.

//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//Example 1:
//
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//Example 2:
//
//Input: numRows = 1
//Output: [[1]]

public class PascalsTriangle {

	public static void main(String[] args) {

		int input = 7;

		int mat[][] = new int[input + 1][input + 1];
		for (int row = 0; row < input; row++) {
			if (row == 0) {
				mat[row][row] = mat[row + 1][row] = mat[row + 1][row + 1] = 1;
				row++;
			} else {
				int index = 0;
				mat[row][index++] = 1;
				for (int col = 0; col < mat[row - 1].length - 1; col++) {
					if (mat[row - 1][col] != 0) {
						mat[row][index++] = mat[row - 1][col] + mat[row - 1][col + 1];
					}
				}
			}
		}

		for (int i = 0; i < input; i++ ) {
			System.out.print("[");
			for (int j = 0; j < input; j++) {
				if (mat[i][j] != 0) {
					System.out.print(mat[i][j]+", ");
					
					
				}
				

			}
			System.out.println("], ");
		}

	}

}
