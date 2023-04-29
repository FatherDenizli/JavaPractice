package mathproblems;

import java.util.Scanner;

public class EvenOddNumbers {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number to check even or odd");

        int number=input.nextInt();

        if ( number%2==0){
            System.out.println("Number is even");
        }else  {

            System.out.println("Number is odd");
        }



    }



}
