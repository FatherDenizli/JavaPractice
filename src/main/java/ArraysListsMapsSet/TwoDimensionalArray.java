package ArraysListsMapsSet;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        String brr[][]= { {"Sally", "Katty"} ,   {"Angie"} ,   {"Mary", "Chris", "Mark"} };


        System.out.println(Arrays.deepToString(brr));
        System.out.println(brr[2][1]);
        System.out.println(brr[0][0]);

        System.out.println(Arrays.toString(brr[2]));


        String crr[][]= { {"Sally", "Katty"} ,   {"Angie"} ,   {"Mary", "Chris", "Mark"} };

        System.out.println(crr.length);
        System.out.println(crr[1].length);
        int sum=0;
        for(String[] w:crr) {
            sum=sum+w.length;

        }
        System.out.println(sum);

        // Object data type array
        Object [][] arr={ {"Sally", 1} ,   {"Angie", 3} ,   {"Mary", "Chris", "Mark",5} };

        System.out.println(Arrays.deepToString(arr));


    }



}
