package com;

import java.util.Scanner;

public class CopyReverse {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
		 
		 int[] a=new int[10];
		 for(int i=0;i<a.length;i++) {
				 a[i]=sc.nextInt();
				}
		 int[] b=new int[10];
		 int j=10;
		 for (int i = 0; i < 10; i++) {
	            b[j - 1] = a[i];
	            j = j - 1;
	        }
	  
	        
	        for (int k = 0; k < 10; k++) {
	            System.out.println(b[k]);
	        }
	}

}
