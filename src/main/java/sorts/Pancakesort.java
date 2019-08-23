package sorts;

import java.util.Arrays;

public class Pancakesort {
    /*
    Pancake sorting:
     In panckage sorting the atmost number of flips could be 2n-3.
    1) The flip method flip the elements of the array till the particular position(k).
     Then it flip to the end such that the largest element stands in the last position
    2) So, the flip method gets input from pancake sort method which selects the maximum element and it position in array
        and passes them to flip method. This method is carried iteratively until all the elements gets sorted out.


  //int maxElementPosition = 5,8,7,10,9,3 here find first the maximum element
        /*
        after flip 10,7,8,5,9,3
                     10,9,5,8,7,3
                      10,9,8,5,7,3
                      10,9,8,7,5,3
        final flip    3,5,7,8,9,10
 */
   public void flip(int[] input_array, int k) {
          /*
          for odd positional elements
           */
       int i = 0;
       int j = k;
       while (i < k) {
           int temp = input_array[j];
           input_array[j] = input_array[i];
           input_array[i] = temp;
           i++;
           j--;
           if (i == k) {
               break;
           }
       }
   }

  /*
  function about the start and end position of the array and passed to maximumElements methods and it checks for the maximum element of the given length of the array.
   */
  public int[] pancakesort(int[] input_array){
       int length = input_array.length;
       int start=0,end=length;
       while(length>=0){
             int position = maximumElement(input_array,start,end);
               flip(input_array,position);
               flip(input_array,end-1);
                  length--;
                   end--;
                       }
            return input_array;
             }


  public int maximumElement(int[] input_array, int start, int end){
            /*
            @param max - initialized with zero and checked for the maximum element in array
            @param k -   It is the position of the max element in the array
             */
             int k = 0, max =0, l=0;
              for(int j=start;j<end;j++){
                if((input_array[j]>max)){
                   max = input_array[j];
                    k = j;
                 }
              }
              return k;
  }

     public static void main(String[] args){
        Pancakesort obj = new Pancakesort();
        int[] input_array = new int[]{5,8,7,4,6,0,2,10,9,3,15,69,78,21,54,698};
       int[] sorted_array ;
       sorted_array = obj.pancakesort(input_array);
        System.out.println(Arrays.toString(sorted_array));
    }
}
