package mathproblems;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");

        int number=input.nextInt();

       Random ran=new Random();
     int randomNumber=ran.nextInt(number);

        System.out.println(randomNumber);

       int numberRan=ran.nextInt(100,200);
        int randomRan = ran.nextInt( 200-100)+100  ;

        System.out.println(randomRan);












    }
}
