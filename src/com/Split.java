package com;

public class Split {

	public static void main(String[] args) {
		int[] a= {58,24,13,15,63,9,8,81,1,78};
		 
		 for(int i=0;i<=a.length/2;i++) {
			System.out.print(a[i]+" ");
			}
			System.out.println();
		 for(int j=a.length/2+1;j<a.length;j++) {
				System.out.print(a[j]+" ");
	}

}

}