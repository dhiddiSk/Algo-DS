package sorts;

import java.util.Arrays;

public class Heapsort{
    /* Rough : First form a max heap sort for a given array, which forms an array such that the root elements are >= root element. once the
         max heap is formed then remove the max element(root element) and put it in the end of the array, then again heapify the
         array except the last element. So iterate the process until the last element, finally we get an sorted array.
     */
/*
@method swap(): swaps the positions of the requested elements for a given array
 */
    private void swap(int[] unsortedArray, int x, int y){
        int temp = unsortedArray[x];
        unsortedArray[x] = unsortedArray[y];
        unsortedArray[y] = temp;
    }

    /*
    @method heapify(): constructs the maxheap of the given array and then selects the max element.
     */
    private void heapify(int[] unsortedArray, int arrayBegin, int arrayEnd){
        int rootPosition = arrayBegin;
        int leftChildPosition = 2 * rootPosition + 1;
        int rightChildPosition = 2 * rootPosition + 2;
        int [] sorted_array = new int[unsortedArray.length];
        /*
     Loop workflow : Every element is verified with different roles by considering the current element as parent and the next two consecutive elements as left child, right
     child, which are supposed to be less than or equal to parent node, if not then swap. Every node has atmost two child nodes.
     First verify the root positions and then verify the array elements.
      */
        // checks for the left child.
         int root_copy;
        for (int i=unsortedArray.length; i>0 ;i--){
            for (int root = rootPosition; root < unsortedArray.length; root++) {
                if (root < leftChildPosition) {
                    if (unsortedArray[root] <= unsortedArray[leftChildPosition]) {
                        swap(unsortedArray, root, leftChildPosition);
                    }
                }
                if (root < rightChildPosition) {
                    if (unsortedArray[root] <= unsortedArray[rightChildPosition]) {
                        swap(unsortedArray, root, rightChildPosition);
                    }

                }
                rootPosition++;
            }
        }

    }
  public static void main(String[] args){
        int[] unsorted_array = new int[]{1,4,98,80,2,1,3,88,7,98};
        int arrayBegin=0,arrayEnd=unsorted_array.length-1;
        Heapsort obj = new Heapsort();
       /*
       Here call the heapify method with all the number of elements times
        */
       for(int call =0 ;call<unsorted_array.length;call++){
           obj.heapify(unsorted_array,call,arrayEnd);
       }

      System.out.println(Arrays.toString(unsorted_array));
  }
}
