package stringmanipulations;

public class sumOfTheNumberOfCharacters {

    /*
       Create 3 String variables for people's names. Print the sum of the number of characters in
	   all the 3 names except space characters.  Example: If the names are Sedat, Yasin Emre, Michael Jackson you should see 28  on the console.

	*/
    public static void main(String[] args) {



    String name1="Sedat";
    String name2="Yasin Emre";
    String name3="Michael Jackson";

    int c1=name1.replaceAll("\\s", "").length();

    int c2=name2.replaceAll("\\s","").length();

    int c3=name3.replaceAll("\\s", "").length();

    int c=c1+c2+c3;

    System.out.println("Total numbers of characters diffrent from space : "+(c1+c2+c3));


}












}
