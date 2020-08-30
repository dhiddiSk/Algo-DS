package DataStructures.Arrays;

/*
Problem Description: An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, A, of size
N,  each memory location has some unique index, i(where 0<=i<N ), that can be referenced as A[i]  (you may also see it written as Ai).

Given an array,A, of N integers, print each element in reverse order as a single line of space-separated integers.

Input Format:

The first line contains an integer, N(the number of integers in A).
The second line contains N space-separated integers describing A.

Constraints:

- 1<=N<=cube(10)
- 1<=Ai<=powerFour(10), where Ai is the i^th integer in A.

 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    // Complete the reverseArray function below.
     static int[] reverseArray(int[] a) {

         int[] reversedOutput = new int[a.length];

         int j = 0;
         for(int i = a.length-1; i>=0; i--) {
             reversedOutput[j] = a[i];
             j+=1;
         }

        return reversedOutput;
     }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        sc.close();
    }
}

