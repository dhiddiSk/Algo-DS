package DataStructures.Stack;

import javax.xml.bind.Element;
import java.util.Scanner;

public class DynamicStack {

    public static void main(String[] args){

       // Scanner sc = new Scanner(System.in);

      //  int elementValue = sc.nextInt();

        StackOperations operations = new StackOperations();

       //System.out.println("Push an element to the stack");

        operations.push(20);
        operations.push(40);
        operations.push(80);
        operations.push(90);
        operations.push(100);

        operations.pop();

        System.out.println("The elements of the stack are:");

        operations.elements();

        operations.pop();

        System.out.println("The elements of the stack after pop");

        operations.elements();

        System.out.println("The maximum element of the stack is");

        System.out.println(operations.maximum());

        System.out.println("The size of the stack is: "+ operations.size());



    }

}
