package DataStructures.Queue;

public class QueueOperations {

    int capacity = 3;

    int[] array = new int[capacity];

    int frontIndex;
    int rearIndex = array.length;

    public void enqueue(int input){

        if(frontIndex>=array.length){
            Expand();
        }
        array[frontIndex] = input;
        frontIndex+=1;
    }

    public void dequeue(){

        if(frontIndex<=0){
            Shrink();
        }
        if (frontIndex > 0) {
            array[frontIndex-1]=0;
            frontIndex-=1;
        }

    }

    public int size(){
        return frontIndex;
    }

    public boolean isEmpty(){

        return frontIndex<=0;
    }

    private void Expand(){

        capacity*=2;

        int[] newArray = new int[capacity];

        System.arraycopy(array, 0, newArray,0,size());

        array = newArray;

    }

    private void Shrink(){

        if(capacity>3){
            capacity/=2;

            int[] newArray = new int[capacity];

            System.arraycopy(array, 0, newArray,0,size());

            array = newArray;

        }
    }

    public void elements(){

        System.out.println();
        for(int n: array){
            System.out.print(n + " ");
        }
        System.out.println();

    }

}
