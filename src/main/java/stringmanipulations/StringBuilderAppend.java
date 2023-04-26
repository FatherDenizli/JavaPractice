package stringmanipulations;

public class StringBuilderAppend {

    public static void main(String[] args) {


        //Example 1:

        StringBuilder strBld1 = new StringBuilder( "6");

        strBld1.append("Java");
        strBld1.append("Learn");

        System.out.println(strBld1);


        //Example 2:

        StringBuilder strBld2 = new StringBuilder("John ");
        strBld2.append("Woo ").append("Leo");

        System.out.println(strBld2);

    }
/* regex: Regex means "Regular Expressions"
         regex represents a group of data.
          All digits :[0-9]
          All lowercase letters: [a-z]
          All upper case letters :[A-Z]
          All lower and uppercase : [a-zA-Z]
          All lower and uppercase letters and digits : [a-zA-Z0-9]
          Some multiple characters like a, e, i, o, u:[aeiou]

          All characters different from digits :[^0-9]
          All characters different from letters :[^a-zA-Z]
          All characters different from vowels [aeiou]

          */
    // caunt the alphabetical characters in a givenString.
    //TomHanks!.. ==>

//String name="          Tom12       Hanks!....  ";

    //int   numOfLetters=name.replaceAll("[^A-Za-z]",replacement: "").length();
    // int numOfLetters1 = name.replaceAll("[^A-Za-z]")
    //     String name = "        Tom12     Hanks!....  Hello...     ";
    //  int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();
    //  System.out.println(numOfLetters);

        /*If you code gives you correct output for some data but if it is not giving you correct output for some other data this is called "hard coding
        It is not accepted

        If your code works for all data it is called "Dynamic coding"
         */
    // int numOfLetters2 = name.replaceAll("[^A-Za-z]", replacement:"").length;

    // int numOfLetters3 = name.replaceAll()
}
