package DataStructures.Stack;

import java.lang.reflect.Array;

public class StackOperations {

   // Let's initialize an array with static size

    int ArrayCapacity = 3;


   int[] array = new int[ArrayCapacity];

   // @variable "top" represents the index of the top most element.
   private int top = 0;

   // Since in the push method the top value exceeds the actual limit value, because
    // it is incremented after assignment of the last value.
    public void pop(){
        if(top<=0){
           shrink();
            System.out.println("stack is empty");
        }
        top--;
        array[top] = 0;
    }

    private void shrink() {
        if(ArrayCapacity>3){
            ArrayCapacity/=2;
            int[] newArray = new int[ArrayCapacity];
            System.arraycopy(array, 0, newArray,0, size());
        }
    }

    public void push(int element) {

        if(top==3){
            System.out.println("DynamicStack is full");
            expandMemory();
        }
        array[top] = element;
        top++;
    }

    private void expandMemory() {
        //initialize an another array with new capacity, then copy the data from old array into the new array.
       ArrayCapacity*=2;
       int[] newArray = new int[ArrayCapacity];
       System.arraycopy(array,0,newArray,0, size());
       array = newArray;
    }

    //@method maximum returns the maximum value of the stack
    public int maximum(){

        int temp =0;

        for (int i=0;i<array.length;i++){

                if(array[i]>temp){
                        temp = array[i];
                }
        }
        return temp;
    }

    // Gives the size of the array
    public int size() {

        if(top>0){
            return top;
        }
        if(top == 0){
            return 1;
        }
        return 0;

    }

    public boolean isEmpty(){

        return top<=0;
    }

    //Prints the elements of the array
    public void elements() {
        System.out.println();
        for(int n: array){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}