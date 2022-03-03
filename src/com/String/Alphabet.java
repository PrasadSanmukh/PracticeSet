package com.String;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
String s="i am @ aland";
Scanner sc= new Scanner(System.in);
int index=sc.nextInt();
char c=s.charAt(index);
        
        if( (c >= 'a' && c<= 'z') || (c>= 'A' && c<= 'Z'))
            System.out.println(c + " is an alphabet.");
        else if(c>=0 && c<=9)
            System.out.println(c + " is Digit.");
        else {
        	System.out.println(c + " is special charecter");
        }
    }
    
}