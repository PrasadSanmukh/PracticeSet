package com;

public class Same {

	public static void main(String[] args) {
		int[] a= {10,40,57,10,50,40};
	 
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j])
				 System.out.println("these elemenys are same:"+a[i]);
			 }
			}
	}

}
