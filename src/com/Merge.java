package com;

import java.lang.reflect.Array;

public class Merge {

	public static void main(String[] args) {
		int[] a= {10,40,57,38};
		int[] b= {115,67,256,108};
		int x=a.length;
		int y=b.length;
		int z=x+y;
		int[] c=new int[z];
		 System.arraycopy(a,0,c,0,x);
		 System.arraycopy(b,0,c,x,y);
		  for(int i=0;i<c.length;i++) {
			  System.out.println(c[i]);
		  }
	}

}
