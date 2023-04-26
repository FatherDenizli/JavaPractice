package stringmanipulations;

import java.util.Scanner;

public class PrimeNumberIF {

    public static void main(String[] args) {

        /*
        7. Write a java program to check whether a given number is prime or not?
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Input a number");
        int num=input.nextInt();
        int counter=0;
        for(int i=1; i<=num; i++){


            if(num%i==0){

              counter++;


            }

        }


        System.out.println(counter);










    }




}
