package InprogressToCompleteTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	public String CONSTs = "w";

	public static void main(String[] args) {

		int[] digits = {9, 9};
		
		int result[] = plusOne(digits);
		
		for(int i = 0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}
	
	public static int[] plusOne(int[] digits) {

		int result = 0;
		int i = 0;
		while(i<digits.length) {
			result =  (result * 10) + digits[i];
		    i++;
		}
		result +=1;
		
		
		while(result!=0) {
			System.out.println(result % 10);
			result /=10;
		}
		
		
		System.out.println(result);
//        if(digits[digits.length-1] == 9){
//            int[] tempArray = Arrays.copyOf(digits, digits.length+1);
//            tempArray[tempArray.length-2] = 1;
//            tempArray[tempArray.length-1] = 0;
//            return tempArray;
//        }
//        
//        digits[digits.length-1] += 1;
        return digits;
    }
	
//	public int[] plusOne(int[] digits) {
//
//        if(digits[digits.length-1] == 9){
//            int[] tempArray = Arrays.copyOf(digits, digits.length+1);
//            tempArray[tempArray.length-2] = 1;
//            tempArray[tempArray.length-1] = 0;
//            return tempArray;
//        }
//        
//        digits[digits.length-1] += 1;
//        return digits;
//    }
	
}