package com.examples.j2se.Loops;
import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int hcf , lcm, t;
		
	       while (a%b!=0) {
	    	   a%=b;
	    	   t=a;
	    	   a=b;
	    	   b=t;
	            
	        }
	       System.out.println("Hcf :"+b);
	       sc.close();
	       
	       
	}

}
