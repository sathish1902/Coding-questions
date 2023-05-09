package patterns;

//input : n = 6;
//
//output:
//1                                                                                                                               
//2 3 2                                                                                                                           
//3 4 5 4 3                                                                                                                        
//4 5 6 7 6 5 4                                                                                                                   
//5 6 7 8 9 8 7 6 5                                                                                                               
//6 7 8 9 0 1 0 9 8 7 6 


//Not Completed  
public class Pattern1 {
	
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1;i<=n;i++) {
			int rowLen = (i-1)*2+1;
			int element = i;
			for(int j = 1;j<=rowLen;j++) {	
				
				if(j>(rowLen/2)) {
					System.out.print(((element >= 10) ? element%10:element) +" ");
					element--;
				}else {
					System.out.print(((element >= 10) ? element%10 :element)+" ");
					element++;				}
			}
			System.out.println();
		}
	}
}
