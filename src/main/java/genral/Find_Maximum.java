package genral;

import java.io.IOException;
import java.util.*;
public class Find_Maximum {
    public static void main(String[] args) throws IOException {
        //Vector<Integer> vc = new Vector<Integer>();
      try{   int[] input = new int[10];
        System.out.println("enter the 10 integer values seperated by space");
        Scanner sc = new Scanner(System.in).useDelimiter("\\s* \\s*");// this delimiter can acccpet the input in form of string seperated by commas
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
      catch (Exception e){
          System.out.println(e);
      }


    }
}
