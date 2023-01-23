package stringmanipulations;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SplitSample {


    public static void main(String[] args) {

        String str = "1 2 3 4";
        str = str.replaceAll(" ", "");

        String[] arr = str.split("");

        System.out.println(Arrays.deepToString(arr));


        for (int i = 0; i < arr.length; i++) {

            System.out.print(Integer.valueOf(arr[i]) + ",");


        }


    }


}
