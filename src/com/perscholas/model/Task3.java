package com.perscholas.model;
//Ahmed Ali RTT-57 4/14/2023
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] array= {"red","green","blue"};

        System.out.println(array.length);

        String[] array2= array.clone();

        System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(array2));

    }
}
