import java.util.*;
/**
* Java 1. Homework #3
*
* @author Ephim
* @version 09.03.2022
*
*
*
*/
public class lesson3 {
	public static void main(String[] args) {
		invertArray();
		fillingEmptyArray();
		changeArrayElmnt();
		diagonalFillingArray();
		
	}
		
		
		// inverting array
		static void invertArray() {
		int[] arr = {1, 0, 0, 0, 0, 1, 0, 0, 1};
		for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]);	
		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++ ){
			
			arr[i] = (arr[i] == 1) ? 0 : 1;
		    System.out.print(arr[i]);
			} 
		System.out.println();
		}
		// filling empty array 
		static void fillingEmptyArray() {
			int[] arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
			arr[i] = arr[i] + (i+1);
	        System.out.print(arr[i]);
		}
		System.out.println();
		}
		static void changeArrayElmnt() {
			int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] < 6) ? (arr[i] * 2) : arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		}
		static void diagonalFillingArray() {
			
			int[][] table = new int [4][4];
				
				for (int i = 0; i < 4; i++) {
					
					for (int j = 0; j < 4; j++) {
					table[i][j] = 0;
					table[i][j] = ((i+j) + 1);	
					System.out.print(table[i][j] + " ");
					} if (table[i][j] == ) {
						
					}
				System.out.println();
				}
		}
		
		
	}


