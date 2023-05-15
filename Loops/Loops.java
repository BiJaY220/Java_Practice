package com.examples.j2se.Loops;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		int n, i ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		n = sc.nextInt();
		int sum=0 ;
		i = 0;
		int count = 0; 
		int div;
		while(n>0) {
			div = n%10;
			n = n/10;
			count++;
			
		}
		System.out.println("the number of natural numbers is :"+count);
		while(i<=n) {
			sum+=i;
			i++;
			
			
			
		}
		System.out.println("Sum of "+n+" natural numbers: "+sum);
		
	}

}
