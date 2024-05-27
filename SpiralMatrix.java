package com.twoDarray;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int size = 9;
		int row = 0,col = 0;
		char ch = 'r';
		
		int[][] arr = new int[size][size];
		
		int limit = size-1, left = size-1, flag = 0;
		
		for(int i=1; i<=size*size;i++) {
			arr[row][col] = i;
			
			switch(ch) {
			case 'r':
				col+=1;
				break;
			case 'd':
				row+=1;
				break;
			case 'l':
				col-=1;
				break;
			case 'u':
				row-=1;
				break;
			}
			
			if(limit == i) {
				limit = limit + left;
				
				if(flag != 2) {
					flag = 2;
				}
				else {
					flag = 1;
					left-=1;
				}
				
				switch(ch) {
				case 'r':
					ch = 'd';
					break;
				case 'd':
					ch = 'l';
					break;
				case 'l':
					ch = 'u';
					break;
				case 'u':
					ch = 'r';
					break;
				}
			}
			
		}
		
		for(int i=0;i<size-1;i++) {
			for(int j = 0;j<size-1;j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
