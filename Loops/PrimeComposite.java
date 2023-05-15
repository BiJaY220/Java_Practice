package com.examples.j2se.Loops;

import java.util.Scanner;

public class PrimeComposite {
	public static void main(String[] args) {
		int n ;
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<2) {
			System.out.println("neither prime nor composite");
		}
		else {
			int i;
			for (i= 2; i<n/2; i++) {
				if(n%i==0) {
					break;
				}
			}
			if(i==(n/2+1)) {
				
				System.out.println("the number is prime ");
			}
			else {
				System.out.println("the number is not prime ");
			}
		}
	}
}
