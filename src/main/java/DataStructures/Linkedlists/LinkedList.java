package DataStructures.Linkedlists;

public class LinkedList{

    Node head;

    public void insertElement(int input){

        Node node = new Node();
        node.value = input;
        node.next = null;

        if(head == null){
            head = node;
        }

        else{
            Node n = head;

            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

     public void show(){

        Node node = head;
        while (node.next!=null){
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(node.value);
    }

    public void insertAtStart(int NewElement){

        Node node = new Node();
        node.value = NewElement;
        node.next = null;
        node.next = head;
        head = node;


    }

    public void insertAtIndex(int index, int NewElement){

        Node node = new Node();
        node.value = NewElement;
        node.next = null;

        Node n = head;

        if(index == 0){
            insertAtStart(NewElement);
        }

        else{

            for(int i=0;i<index;i++){

                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }




        node.next = head;
        head = node;


    }



}