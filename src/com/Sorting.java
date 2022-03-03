package com;

public class Sorting {

	public static void main(String[] args) {
		int[] a= {2,3,1,45,15};
		int flag=0;
		for(int i=1;i<a.length;i++) {
			 if(a[0]>a[i]) {
				flag=a[0];
				 a[0]= a[i];
				 a[i]=flag;
			 }
		 }
		for(int i=2;i<a.length;i++) {
			 if(a[1]>a[i]) {
				flag=a[1];
				 a[1]= a[i];
				 a[i]=flag;
			 }
		 }
		for(int i=a.length-1;i<a.length;i++) {
			 if(a[a.length-2]>a[i]) {
				flag=a[a.length-2];
				 a[a.length-2]= a[i];
				 a[i]=flag;
			 }
		 }
		for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]); 
		 }
	}

}
