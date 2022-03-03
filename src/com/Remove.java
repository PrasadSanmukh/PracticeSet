package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		 int[] a= {10,20,30,40,50};
		 int x=a.length-1;
		 Scanner sc=new Scanner(System.in);
		 int r=sc.nextInt();
	 
		 int[] b=new int[x];
		 
		 
		 for(int i=0,k=0;i<a.length;i++) {
			 if(i==r) {
				 continue;
			 }
			 else {
				 b[k++]=a[i];
			 }
		 }
			for(int i=0;i<b.length;i++)	{
				System.out.println(b[i]);
			}

	}

}
