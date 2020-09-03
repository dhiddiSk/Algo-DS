package DataStructures.Linkedlists;

import sun.awt.image.ImageWatched;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        System.out.println("Number of elements to enter");

        Scanner sc = new Scanner(System.in);

        int numberOfElements = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);

        LinkedList list = new LinkedList();

        for(int i=0;i<numberOfElements;i++){

            int input = sc2.nextInt();
            list.insertElement(input);
        }
        list.show();
        System.out.println("After adding an element'20'in the start");

        list.insertAtStart(20);
        list.show();

        System.out.println("Adding element at particular index of the linkedList");

        list.insertAtIndex(3,35);


        //list.remove(10);

    }
}

