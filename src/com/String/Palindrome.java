package com.String;

public class Palindrome {

	public static void main(String[] args) {
		String  s="my college is kayak";
String s1;
String s2="";
s1=s.substring(14);
System.out.println(s1);
for(int i=s1.length()-1;i>=0;i--) {
 	s2 =s2+s1.charAt(i);
}
System.out.println(s2);
if(s1.equals(s2)) {
	System.out.println("palindrom");
}
else {
	System.out.println("not palindrom");
}
	}

}
