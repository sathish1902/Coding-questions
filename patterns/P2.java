package patterns;

public class P2 {

	public static void main(String[] args) {
		
		int n = 5;
		int colsize = 2;
		int spaces;
		int spaces2 = n;
		for(int row = 1; row <= n; row++,System.out.println()) {
			
			
//			
//			for(int col = 0;col<((n / 2)+1 == row ?colsize-1:colsize);col++) {
//				
//				System.out.print(row);
//			}
			
			spaces = row;
			if((n / 2)+1 < row ) {
				spaces = n-spaces+1;
				
				
				
//				System.out.print();

			}
			
			for(int space = 1; space < spaces; space++) {
				System.out.print("  ");
			}
			
			
			
			
			System.out.print(row);

			
			for(int space = 1; space < spaces2; space++) {
				System.out.print("  ");
			}
			spaces2-=2;
			
			//System.out.print("  "+ ());
			if((n / 2)+1 != row ) {
				
				System.out.print(row);
			}
		}		
	}
}
