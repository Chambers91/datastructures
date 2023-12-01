package com.chamberscode;

public class sortingAlgorithms {

    public static void main(String[] args) {

        //selection Sort
        //search through an array and keep track of the minimum value during each iteration.
        //At the end of each iteration, we swap variables.

        //Quadratic time 0(n^2)
        //small dataset = okay
        //large dataset = BAD

        // understanding int min is the nex required element or number within the array
        // and int temp is a holder for any element that is being replaced by a lower element/number

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

            selectionSort(array);

            for (int i : array) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {

        //for loop declaring that the array will run as long as the length of the array -1 then the array should increment/move forward by 1
        //nested loop declares that the array will run as long as the length of the array is -1 then the array should increment by 1
        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[min] < array[j]) {
                    min = j;
                }
            }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
        }

    }



 }

