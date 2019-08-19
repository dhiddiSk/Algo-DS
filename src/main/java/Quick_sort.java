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
import java.util.Random;
public class Quick_sort{
    public void sorting(int[] arrayInput){
       sorting(arrayInput,0,arrayInput.length-1);
    }

    private void sorting(int[] arrayInput, int left, int right) {
       if(left<right+1){
        /*
        partition method is called which returns an index
         */
           int p = partition(arrayInput,left,right);

        sorting(arrayInput,left,p-1);
        sorting(arrayInput,p+1,right);

    }
    }
/*
this pivot calculator calculates random inxex
@return int index
 */
    private  int pivotcalculator(int left, int right){
       Random obj2 = new Random();
      return obj2.nextInt((right-left)+1)+left;

    }

/*
Sorts the array such that the right side array are greater than pivot and left side are lesser than pivot.
 */
    private  int partition(int[] arrayInput, int left, int right) {
        swap(arrayInput, left, pivotcalculator(left, right));
        int border = left + 1;
        for (int i = border; i <= right; i++) {
                  if(arrayInput[i]<arrayInput[left]){
                       swap(arrayInput,i,border++);
                  }
        }
        swap(arrayInput,left,border-1);
         return border-1;
    }
  /*
  This method swaps the elements the array.
   */
     void swap(int[] arrayInput, int left, int right) {
            int temp = arrayInput[left];
            arrayInput[left] = arrayInput[right];
            arrayInput[right] = temp;

                    }

    public static void main(String[] args){
        int[] arrayInput = new int[]{9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};
          Quick_sort obj = new Quick_sort();
          obj.sorting(arrayInput);
        System.out.println(Arrays.toString(arrayInput));
    }
}

