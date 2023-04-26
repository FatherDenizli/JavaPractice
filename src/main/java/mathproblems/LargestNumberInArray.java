package mathproblems;

import java.util.Arrays;

public class LargestNumberInArray {

/*
2. Write a java program to find the second largest number in the array? Maximum
and minimum number in the array?
 */
    public static void main(String[] args) {
      //  1. easiest one

        int[] numArray={12,13,12,15,0,-1};

        Arrays.sort(numArray);

       int secondLargestNum=numArray[numArray.length-2];

        System.out.println(secondLargestNum);

// -1, 0 , 12, 12 , 13,  15








            }

        }



























