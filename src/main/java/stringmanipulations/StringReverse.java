package stringmanipulations;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        /*
        5. Write a java program to reverse String? Reverse a string word by word?
         */

        String a="Hello Syntax";
        //Reverse Function //show only after learning StringBuffer
        StringBuffer sb=new StringBuffer(a);
        sb.reverse();
        System.out.println(sb.reverse());

//          Without reversmethod
        String toReverse="Hello World";
        String[] toReverseArr=toReverse.split("");
        for (int i=0; i<toReverse.length(); i++){

            System.out.print(toReverseArr[toReverse.length()-1-i]);

        }
        System.out.println();
//        Reverse a string word by word

        String str = "Todays is Sunday";
        String[] arr=str.split(" ");

        for(int i=0; i<arr.length; i++){


            System.out.println(arr[arr.length-1-i]);

        }



        Scanner input=new Scanner(System.in);
        System.out.println("PLS enter a number to check whether it is polindrome");
        int b=input.nextInt();
        String c=Integer.toString(b);
        String[] brr=c.split("");
        //int numDigitTotal=0;
        String polindromeNumber="";

        for (int i=0; i<brr.length; i++){


            polindromeNumber=polindromeNumber+brr[brr.length-1-i];


        }

        System.out.println(polindromeNumber);

        if(c.equals(polindromeNumber)){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not Polindrome");
        }

//        6. Write a Java Program to find whether a String is palindrome or not.


        Scanner iinput=new Scanner(System.in);
        System.out.println("PLS Enter a word to check polindrome");
        String original=iinput.next();



        String[] crr=original.split("");
        String reverse="";
        for(int i=0; i<crr.length; i++){

            reverse=reverse+crr[crr.length-1-i];


        }

        if (original.equals(reverse)){
            System.out.println("polindrome");
        }else{
            System.out.println("Not Polindrome");
        }

        System.out.println(reverse);































    }









}
