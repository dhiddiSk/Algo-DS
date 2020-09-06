package DataStructures.Queue;

import java.util.Scanner;

public class DynamicQueue {

    public static void main(String[] args) {

        QueueOperations operations = new QueueOperations();

      //  Scanner sc = new Scanner(System.in);

      //  int i = sc.nextInt();


        operations.enqueue(20);
        operations.enqueue(30);

        operations.elements();
        System.out.println(operations.size());

       operations.dequeue();


        operations.elements();
        System.out.println(operations.size());
        operations.size();

    }

}
