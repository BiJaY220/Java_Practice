package com.examples.j2se.Functions;

import java.util.Scanner;

public class sum_of_dig {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = sum(num);
		System.out.println(res);
	}

	private static int sum(int num) {
	
		if(num<10) {
			return num;
		}
		
		// TODO Auto-generated method stub
		return num%10+sum(num/10) ;
	}

}
