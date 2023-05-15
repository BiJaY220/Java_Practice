package com.examples.j2se;

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {4,5,6}};
		int[][] b = {{9,7,8}, {6,7,3}};
		int [][]c = new int[2][3];
		int i,j;
		for(i=0; i<2; i++) {
			for(j=0; j<a[0].length; j++) {
				c[i][j] =a[i][j] + b[i][j];
			}
	}
		for(i=0; i<a.length;i++) {
			for(j=0; j<a[0].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
	}
}
}
