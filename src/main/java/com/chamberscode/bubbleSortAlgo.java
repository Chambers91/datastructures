package com.chamberscode;

public class bubbleSortAlgo {

    //bubblesort compares 2 indexes at a time, working to place the array in the correct order
    private static void bubbleSort(int[] arr){

        /*example is an array from 0 up to N - 1
the array can not go any further than N or N-1
because we are comparing i to i + 1
 */

        //initial for loop i to n times until the loop is down to 0
        for(int i=0; i < arr.length; i++){
            /*inner loop implements the check n-1-i
            because the last index regarding n has been sorted
            so to move on to the next index you would proceed to
            the next index in the array with n-1-i
             */
            for(int j=0; j < arr.length - 1 - i; j++)
                //if array i is> arrayj then swap
                //recreating the algorithm from the inner loop
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
        }
    }
}
