package com;

public class Duplicate {

	public static void main(String[] args) {
		int[] a= {10,40,57,10,50,40};
		int count=0;
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j])
				 count++;
			 }
			}
		 
		 System.out.println(count);
	}
	
}
