package com;

public class Sum {

	public static void main(String[] args) {
		int[] b= {115,67,256,108};
		int sum=0,sum1=0;
		 for(int i=0;i<b.length;i++) {
			 if(b[i]%2==0) {
				 sum=sum+b[i];
			 }
			 else {
				 sum1=sum1+b[i];
			 }
		  }
		 System.out.println(sum);
		 System.out.println(sum1);
	}

}
