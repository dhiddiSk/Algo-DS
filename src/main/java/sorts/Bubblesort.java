package sorts;

import java.util.Arrays;

public class Bubblesort {
    public static void  main(String[] args){
      int[] array = new int[]{9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};
       Bubblesort obj = new Bubblesort();
        obj.sort(array);
      System.out.println(Arrays.toString(array));
    }
    /*
    Needs two pointer pointing to two consecutive elements of array and compare the elements of the array if the first element is greater than second
    then swap them, else continue with further elements
     */
    public void sort(int[] array) {
           int count=0;
            while(count<=array.length){
            for(int index=0;index<array.length-1;index++){
                if(array[index] >= array[index+1]){
                   swap(array,index);
                }
             }
                count++;
            }
        }
        /*
        @method swap swaps the array elements in ascending order
         */

    public void swap(int[] array, int index){
            int temp = array[index];
            array[index] = array[index+1];
            array[index+1]=temp;
        }

}
