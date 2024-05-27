package com.twoDarray;

public class SumOfEvenOdd {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int esum = 0;
		int osum = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] %2 == 0) {
					esum += arr[i][j];
				}
				else {
					osum += arr[i][j];
				}
			}
		}
		
		System.out.println(esum);
		System.out.println(osum);
	}

}
