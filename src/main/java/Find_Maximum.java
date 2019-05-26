import java.util.*;
public class Find_Maximum {
    public static void main(String[] args){
        //Vector<Integer> vc = new Vector<Integer>();
       int[] input = new int[10];
        System.out.println("enter the 10 input integer values seperated by comma");
        Scanner sc = new Scanner(System.in).useDelimiter("\\s*,\\s*");// this delimiter can acccpet the input in form of string seperated by commas
         for(int i=0;i<10;i++){
           input[i] = sc.nextInt();
           }
        sc.close();
    int max = input[0];
    for(int j=1;j<input.length;j++){
        if (input[j] > max){
         max = input[j];
        }
    }
System.out.println(max);

    }
}
