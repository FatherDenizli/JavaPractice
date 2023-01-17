package stringmanipulations;

public class StringBuilderAppend {

    public static void main(String[] args) {


        //Example 1:

        StringBuilder strBld = new StringBuilder( "6");

        strBld.append("Java");
        strBld.append("Learn");

        System.out.println(strBld);


        //	Example 2:
        StringBuilder strBld1 = new StringBuilder("John ");
        strBld1.append("Woo ").append("Leo");
        System.out.println(strBld1);


    }


}
