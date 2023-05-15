package com.examples.j2se.Loops;

public class triangle {
public static void main(String[] args) {
		
		System.out.println("Shapes: ");
		int i ,j;
		System.out.println("\nRectangle");
		for(i=0;i<5;i++) {
			for(j=0;j<4;j++) {
			System.out.print("* ");
			
		}
			System.out.println();
			
	}
		System.out.println("Shapes: ");
		
		System.out.println("\ntriangle 1");
		for(i=0;i<5;i++) {
			for(j=0;j<5-i;j++) {
			System.out.print("* ");
			
		}
			System.out.println();
			
	}
		System.out.println("Shapes: ");
		
		System.out.println("\ntriangle 2");
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		System.out.println("\ntriangle 3");
		for(i=0;i<5;i++) {
			for(j=0;j<4-i;j++) {
				System.out.print("   ");
				
			}
			for(j=0;j<=i;j++) {
				System.out.print("*  ");
				
			}
			System.out.println();
			
		}
		System.out.println("Shapes: ");
}
}
