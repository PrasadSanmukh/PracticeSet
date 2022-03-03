package com;

public class CharDuplicate {

	public static void main(String[] args) {
		char[] a= {'a','c','a','p','m','p'};
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
