package mathproblems;

import java.util.Scanner;

public class QuadraticEquationSolving {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Pls enter First Coefficient of Quadratic Equation   a= ");
        int a= input.nextInt();
        System.out.println("Pls enter Second  Coefficient of Quadratic Equation   b=");
        int b= input.nextInt();
        System.out.println("Pls enter Third Coefficient of Quadratic Equation   c=");
        int c= input.nextInt();

        //x1; root1
        //x2 :root2

        double reel=0;
        double imaginal=0;

        double delta = b*b-4*a*c;
        if (delta<0) {

            reel = -b / (2.0 * a);
            imaginal = Math.sqrt(Math.abs(delta)) / (2 * a);
            System.out.println("x1 =" + reel + "+" + "j" + imaginal);
            System.out.println("x2 =" + reel + "+" + "j" + imaginal);

        }else  if(delta>0) {

            reel=-b/(2.0*a);
            imaginal=Math.sqrt(delta)/(2*a);
            System.out.println("x1 =" + reel + "+" + "j" + imaginal);
            System.out.println("x2 =" + reel + "-" + "j" + imaginal);

        }else
        if (delta == 0) {

            reel = -b / (2.0 * a);
            imaginal = Math.sqrt(delta) / (2 * a);
            System.out.println("x1 =" + reel);
            System.out.println("x2 =" + reel);

        }
    }













}
