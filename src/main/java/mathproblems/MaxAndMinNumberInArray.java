package mathproblems;

import java.util.Arrays;

public class MaxAndMinNumberInArray {

    public static void main(String[] args) {
/*
2. Write a java program to find the second largest number in the array? Maximum
and minimum number in the array?
 */

    int[]   arr={12,13,12,15,0,-1};

    Arrays.sort(arr);

    int min=arr[0];
    int max=arr[arr.length-1];
        System.out.println("Min is " +min+ " max is " +max);

        // more efficient way

        int[]   numArr={12,13,12,15,-1,0};
        int smallest=0;
        int biggest=0;

        for(int i=0; i<numArr.length; i++){

            if (numArr[i]>biggest){

                biggest=numArr[i];
                smallest=numArr[i];

            }

            if (numArr[i]<smallest){

                smallest=numArr[i];
            }

            }

        System.out.println(smallest);
        System.out.println(biggest);





        }

}









