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
}
