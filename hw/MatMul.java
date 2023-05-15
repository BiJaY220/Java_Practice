package com.examples.j2se.hw;

import java.util.Scanner;

public class MatMul {
	public static void main(String[] args) {
		int a , b, c ,d;
		System.out.println("Enter order of first matrix:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter order of second matrix: ");
		c = sc.nextInt();
		d = sc.nextInt();
		if(b!=c) {
			System.out.println("multiplication is not possible");
			
		}
		else {
			int[][] x = new int[a][b];
			int[][] y = new int[c][d];
			System.out.println("enter the elements of first matrix ");
			for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					
					
				}
			}
			int[][] p = new int[a][d];
			int i,j,k;
			for(i=0 ; i< a; i++) {
				for(j=0 ; j<c; j++) {
					p[i][j] = 0;
					for(k= 0; k <b; k++) {
						p[i][j] +=x[i][k] * y[k][j];
						
					}
				
					
				}
					
			}
			for( i=0; i<a;i++) {
				for( j=0; j<d; j++) {
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
		}
		
	}

}
}
