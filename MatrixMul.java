package com.examples.j2se;

public class MatrixMul {
	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {4,5,6}};
		int[][] b = {{9,7,8}, {6,7,3}, {3,4,2}};
		int [][]p = new int[2][3];
		int i,j,k;
		for(i=0; i<2; i++) {
			for(j=0; j<a[0].length; j++) {
				p[i][j]=0;
				for(k=0;k<3; k++) {
				p[i][j] =a[i][k] * b[k][j];
			}
	}
		for(i=0; i<2;i++) {
			for(j=0; j<3; j++) {
				System.out.print(p[i][j]+"\t");
			}
			System.out.println();
			

	}
}
		
	}
}
