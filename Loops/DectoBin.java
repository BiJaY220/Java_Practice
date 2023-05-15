package com.examples.j2se.Loops;

import java.util.Scanner;

public class DectoBin {
	public static void main(String[] args) {
		int dec, bin, rem, rbin;
		System.out.println("enter a decimal value:");
		Scanner sc = new Scanner(System.in);
		dec = sc.nextInt();
		rbin = 0;
		while(dec>0) {
			rem = dec%2;
			rbin = rbin*10+rem;
			dec/=2;
			
		}
		bin = 0 ;
		while(rbin>0) {
			rem= rbin%10;
			bin= bin*10+rem;
			rbin/=10;
			
		}
		System.out.println("rbin:"+bin);
	}

}
