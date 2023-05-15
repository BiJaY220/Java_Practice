package com.examples.j2se;
import java.util.Scanner;


public class Variables {
	public static void main(String[] args) {
		byte b;
		b = 123;
		System.out.println("Byte : "+b);
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		System.out.println("out " +b);
		
	}
}
