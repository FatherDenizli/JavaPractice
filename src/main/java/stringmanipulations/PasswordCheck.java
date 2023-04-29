package stringmanipulations;

public class PasswordCheck {




        public static void main(String[] args) {

            String str="Java is easy";

            boolean isExist=str.contains("Java");

            //System.out.println(isExist);


            boolean result=str.startsWith("Java");

            System.out.println(result);


            boolean res=str.startsWith("i",5);

            System.out.println(res);
      /*Teacher's'   String str = "Java is easy";
        boolean isExist = str.contains("Java");
        System.out.println(isExist);//true


        boolean result = str.startsWith("Java");
        System.out.println(result);//true

 If you use startsWith() method with 2 parameters, second parameter means skip the first characters
        boolean res = str.startsWith("i", 5);
        System.out.println(res); */

            String pwd="xy1AmSW?";
            boolean firstRule=pwd.contains("A") ; //Has "A" in any position
            boolean secondRule=pwd.startsWith("xy");
            boolean thirdRule=pwd.startsWith("W",6);
            boolean fourthRule=pwd.length()==8;
            System.out.println("Is the pasword valid:"+ (firstRule&& secondRule && thirdRule && fourthRule));
/*/*
    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total
  /*

        String pwd = "xy1AmSW?";

 i) has "A" in any position
        boolean firstRule = pwd.contains("A");

 ii) has "xy" at yhe beginning
        boolean secondRule = pwd.startsWith("xy");

 iii) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("W", 6);

 iv) has 8 characters in total
        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password vaild? " + (firstRule && secondRule && thirdRule && fourthRule));*/

            String s="Do practice to better";
            boolean  rslt=s.endsWith("better");
            System.out.println(rslt);

            String t=s.concat("!").concat("..."); //concat() is same with  "+" in Java.
            // If you use multiple methods side by side , it is called "method chain"


            System.out.println(t);//Do practice to better!


            String ss= " Miami 33018!!! ";
            Integer numOfChars = ss.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
            System.out.println("Total num of alphabetical and numeric characters chars:" + numOfChars);



        }



    }













