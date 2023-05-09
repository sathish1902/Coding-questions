package patterns;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		int spacesize = n;
		for(int row = 0;row <= n;row++) {
			for (int col = 0; col < spacesize; col++) {
				System.out.print("  ");
			}
			for (int col = row; col > 0; col--) {
				System.out.print(col + " ");
			}
			for(int col = 0;col<= row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
			spacesize--;

		}
		

	}

}
