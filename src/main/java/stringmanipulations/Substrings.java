package stringmanipulations;

import java.util.Arrays;

public class Substrings {

    public static void main(String[] args) {


        String a="Welcome to the interview sessions with Syntax";

        System.out.println(a.substring(39));

        String[] words=a.replaceAll(" ", "").split("");

        System.out.println(words.length);

        for(String string:words){
            System.out.print(string);

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



    }



}
