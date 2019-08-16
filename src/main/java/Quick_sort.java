/*
Here in the quick sort the elements of an given array are sorted by considering an pivot(generally the middle ones)
element and comparing remaining elements left and right to it. Thus, results in an array with lesser elements to left
side of pivot and greater to the right side to it.
Then after the elements in the left and right of pivot are sorted using the same procedure also sorted. whcih finally
results in an completely sorted array.
 step1 : Derive an pivot element and then compare all the elements of the array with the pivot element, such that the left
         ones are smaller and the right ones are greater than the pivot element
 step2:  Similarly carry the same operation on the left array and the right array i.e define a pivot element and then bacck
         to step one.

  do this iteratively until the whole array is sorted completely
 */
import java.util.Arrays;
public class Quick_sort{
    private static void partition(int left, int right,int[] arrayInput) {
       int pivot = arrayInput[right];
       int lastButOne = right-1;
       /*
             left elements of the array such that the left array elements are smaller than pivot.
             */
                 while(left < lastButOne){
                    while(arrayInput[left]<pivot && arrayInput[lastButOne]>pivot){
                        ++left;
                        --lastButOne;
                          }
                    while(arrayInput[left]>=pivot && arrayInput[lastButOne]>pivot){
                        --lastButOne;
                         }
                   while(arrayInput[left]<pivot && arrayInput[lastButOne]<=pivot){
                       ++left;
                   }
                    if(arrayInput[left] > pivot && arrayInput[lastButOne] <= pivot){
                         Quick_sort.swap(arrayInput,left,lastButOne);
                         ++left;
                         --lastButOne;
                        }
                    else{
                        ++left;
                        --lastButOne;
                    }
                   }
        System.out.println(Arrays.toString(arrayInput));
               }

     public static void swap(int[] arrayInput, int left, int lastButOne){
        /*
        Swapping the elements
         */
          int temp = arrayInput[left];
          arrayInput[left] = arrayInput[lastButOne];
          arrayInput[lastButOne] = temp;
    }

    public static void main(String[] args){
        int[] arrayInput = new int[]{3, 4, 1, 32, 0, 1, 5, 12 ,2, 5 ,7 ,8 ,9, 2, 44, 111, 5};
          int left =0, right = (arrayInput.length)-1;
        Quick_sort.partition(left,right,arrayInput);
    }
}