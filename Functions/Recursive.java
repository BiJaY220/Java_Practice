package com.examples.j2se.Functions;

import java.util.Scanner;

public class Recursive {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = sum(num);
		System.out.println("Sum: "+sum);
	}

	private static int sum(int num) {
//		int res = o;
//		for(int i= 0 ; i <=num; i++) {
//			res+=i;
//		}
		// TODO Auto-generated method stub
		//return res;
		if(num==0) {
			return 0;
		}
		return num + sum(num-1);
	}
}
