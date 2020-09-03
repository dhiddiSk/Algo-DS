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

    public void remove(int removeNumber){

        Node node = new Node();
        while (head != null){

            if(node.value == removeNumber){

            }
            break;

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

}