/*
Here in the quick sort the elements of an given array are sorted by considering an pivot(generally the middle ones)
element and comparing remaining elements left and right to it. Thus, results in an array with lesser elements to left
side of pivot and greater to the right side to it.
Then after the elements in the left and right of pivot are sorted using the same procedure also sorted. whcih finally
results in an completely sorted array.
 */


class Quick_sort_core{
    public int[] LA = new int[6];
    public int PE, temp1,temp2;
    public int[] RA = new int[6];
    Quick_sort_core(int[] LA ,int[] RA,int PE){
        this.LA = LA;
        this.RA = RA; this.PE = PE;
    }
    public void comparator(){
        for(int i =0 ; i<=LA.length;i++){                        // LA -left Array, RA- Right Array, PE- Pivot Element
            if(PE > LA[i]){
                System.out.println(LA);
            }
            else{
                temp1 = PE;
                PE = LA[i];
                LA[i] = temp1;
            }
        }
        for(int j = LA.length+1; j<=RA.length;j++){
            if(PE < RA[j]){
                System.out.println(RA);
            }
            else{
                temp2 = PE;
                PE = RA[j];
                RA[j] = temp2;
            }
        }

    }
}
public class Quick_sort {
    public static void main(String[] args){
        int[] array_input = new int[]{6,7,8,9,10,1,2,3,4,5};
        int pivot_element,position;
        if((array_input.length%2)==0){
            position = ((array_input.length)/2);
            pivot_element = array_input[position];
        }
        else{
            position = (((int)((array_input.length)/2)+1));
            pivot_element = array_input[position];
        }
        //System.out.println(pivot);
        int[] array_left = new int[position];
        int[] array_right = new int[array_input.length - position];
        if((array_right.length - array_left.length)>0){
            Quick_sort_core  object1 = new Quick_sort_core(array_left , array_right, pivot_element);

        }


    }
}

