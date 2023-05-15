package com.examples.j2se.Operators;
import java.util.Scanner;
public class Operators {
	public static void main(String[] args) {
		int x = 5;
		int y =x%4;
		System.out.println(x);
		y = x++;
		
		System.out.println("x: "+x+", y:"+y);
		System.out.println("enter your age");
		int age = new Scanner(System.in).nextInt();
		//TernaryOperator
		String msg = age<18?"Minor":"adult";
		System.out.println(msg);
	}

}
