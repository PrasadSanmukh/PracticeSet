package com.String;

public class UpperCase {

	public static void main(String[] args) {
		String s="i love myINDIA";
String u="";
String l="";
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
		u=u+s.charAt(i);
	}
	else {
		l=l+s.charAt(i);
	}
	
}
System.out.println(u+l);
	}

}
