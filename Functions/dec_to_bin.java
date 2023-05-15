package com.examples.j2se.Functions;

import java.util.Scanner;

public class dec_to_bin {
	public static void main(String[] args) {
		System.out.println("Enter a dec number :");
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int bin = bin(dec);
		System.out.println("binary :"+bin);
		
	}

	private static int bin(int dec) {
		if(dec==0){
			return 0;
		}
		
		// TODO Auto-generated method stub
		return bin(dec/2)*10+dec%2;
	}
}

