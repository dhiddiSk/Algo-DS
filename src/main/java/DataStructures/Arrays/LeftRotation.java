package DataStructures.Arrays;

/*
Problem Description: A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array
[1,2,3,4,5], then the array would become[3,4,5,1,2]. Given an array of n integers and a number,d, perform d  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of n(the number of integers) and  d(the number of left rotations you must perform).

The second line contains n space-separated integers describing the respective elements of the array's initial state.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class LeftRotation {


        static int[] rotation(int[] a, int d){

            int sizeOfArray = a.length;
            int NumberOfRotations = d;

            int[] afterRotation = new int[sizeOfArray];

            int newIndex = 0;

           // copy elements after the d till the size of the array

            while(NumberOfRotations < a.length){
                afterRotation[newIndex] = a[NumberOfRotations];
                newIndex++;
                NumberOfRotations++;
            }

            // copy elements from 0 to d
            NumberOfRotations=0;
            while (NumberOfRotations<d){

                afterRotation[newIndex] = a[NumberOfRotations];
                NumberOfRotations++;
                newIndex++;
            }

         return afterRotation;
        }



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String[] nd = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nd[0]);

            int d = Integer.parseInt(nd[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            scanner.close();
            int[] temp = rotation(a,d);

            for(int m=0;m<temp.length;m++){

                System.out.print(temp[m]+" ");

            }

        }
    }