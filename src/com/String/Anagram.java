package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
         s=s.replaceAll("//s", "").toLowerCase();
         s1=s1.replaceAll("//s", "").toLowerCase();
         char[] c=s.toCharArray();
    	 char[] c1=s1.toCharArray();
    	 Arrays.sort(c);
    	 Arrays.sort(c1);
         if(s.length()!=s1.length()) {
        	 System.out.println("not anagram");
         }
         else if(s.length()==s1.length()){
        	
        	 if(Arrays.equals(c, c1)) {
        		 System.out.println("anagram");
        	 }
        	 else {
        		 System.out.println("not anagram");
        	 }
         }
	}

}
