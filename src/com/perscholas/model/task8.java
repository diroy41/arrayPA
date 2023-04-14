package com.perscholas.model;
//Ahmed Ali RTT-57 4/14/2023
import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        String[] array= {"red","green","blue","yellow","black"};
        String temp = array[array.length/2];
        array[array.length/2]= array[0];
        array[0]= temp;

        System.out.println(Arrays.toString(array));
    }
}
