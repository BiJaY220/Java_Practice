package com.examples.j2se.dataTypes;

public class selectionSort {
	public static void main(String[] args) {
		int[] a = {5,6,3,7,8,9,2};
		int i, j, min, t ;
		for(i=0; i<a.length-1; i++ ) {
			min=i;
			for(j=i+1; j<a.length; j++) {
				if(a[min]<a[j]) {
					min=j;
				}
			}
			t=a[min];
			a[min]=a[i];
			a[i]=t;
			
			for(t=0; t<a.length; t++) {
				System.out.print(a[t]+" ");
			}
			System.out.println();
		}
	}
		
		}


