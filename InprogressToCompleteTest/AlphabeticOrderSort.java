//package InprogressToCompleteTest;
//
////		input:
////		Skillrack
////		
////		output:
////		******a**                                                                                                                       
////		*******c*                                                                                                                       
////		**i******                                                                                                                       
////		*k******k                                                                                                                       
////		***ll****                                                                                                                       
////		*****r***                                                                                                                       
////		S********
//public class AlphabeticOrderSort {
//
//	public static void main(String[] args) {
//
//
//		String input = "Skillrack";
//		
//		char arr[] = input.toCharArray();
//		
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//
//
//				if (Character.toLowerCase(arr[j]) > Character.toLowerCase(arr[j+1])) {
//					char temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				
//				if(j == input.indexOf(arr[i])) {
//					System.out.print(arr[i]);
//					
//					if(i<  arr[i] == arr[i+1]) {
//						System.out.print(arr[i+1]);
//						i++;
//						j++;
//					}
//				}else {
//					System.out.print("*");
//				}
//				
//			}
//			
//			System.out.println();
//		}
//		
//		
//		
//	}
//
//}
