package com.examples.j2se.Functions;
import java.util.Scanner;
import java.util.scanner;

public class classwork {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = prime(n);
		if(isPrime) {
			System.out.println("Prime");
			
		}
		else {
			System.out.println("composite");
		}
		private static boolean prime(int n ) {
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					return false;
					
				}
			}
			return true;
		}
	}
	

}
