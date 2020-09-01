package DataStructures.Arrays;
import java.io .*;
import java.math .*;
import java.security .*;
import java.text .*;
import java.util .*;
import java.util.concurrent .*;
import java.util.regex .*;

/*
Problem Description: Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value
to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

// Reference to hacker rank dataStructures/arrays problem.
 */
public class ArrayManipulation {

       // Complete the arrayManipulation function below.
        static long Manipulation(int n, int[][] queries) {
            int[] array = new int[n];
            int arraySize = queries[1].length;
            for(int operation =0;operation<arraySize;operation++){

                int startIndex = queries[operation][0];
                int endIndex = queries[operation][1];
                int valueToAdd = queries[operation][2];

                for(int index = startIndex; index<=endIndex; index++){
                    array[index-1]+= valueToAdd;
                }
            }
            return Arrays.stream(array).max().getAsInt();
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp.log"));

            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] queries = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] queriesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int queriesItem = Integer.parseInt(queriesRowItems[j]);
                    queries[i][j] = queriesItem;
                }
            }

            long result = Manipulation(n, queries);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();

        }
}
