package stringmanipulations;

public class NotRemoveLastIndex {

    public static void main(String[] args) {

        String str="hello";


      for(int i=0; i<str.length(); i++) {

          if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){

              System.out.println(str.charAt(i));
             System.out.println(str.indexOf(str.charAt(i)));
             System.out.println(str.lastIndexOf(str.charAt(i)));
       }

        }






    }













}
