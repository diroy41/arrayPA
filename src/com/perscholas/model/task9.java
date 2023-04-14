package com.perscholas.model;

import java.util.Arrays;
//Ahmed Ali RTT-57 4/14/2023
public class task9 {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 13, 1, 0};
        int smallest = array[0];
        int biggest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
            } else if (array[i] >= biggest) {
                biggest = array[i];
            }
        }

            Arrays.sort(array);
            System.out.println("Arrays in ascending order: "+Arrays.toString(array));

           System.out.println("The smallest number is " + smallest);
            System.out.println("The biggest number is " + biggest);
        }
    }
