package _2_LinkedList;

/**
 * A Linked List is a linear data structure where elements (nodes) are linked using pointers.
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void remove(int data){

        if(head == null){
            System.out.println("No elements present in the list");
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.data != data){
            prev = current;
            current = current.next;
        }

        if(current == null){
            System.out.println("Data not found to remove the node");
            return;
        }
        prev.next = current.next;
    }

    public static void main(String[] args) {
        LinkedListImplementation listImplementation = new LinkedListImplementation();
        listImplementation.add(10);
        listImplementation.add(20);
        listImplementation.add(30);
        listImplementation.add(40);
        listImplementation.add(50);
        listImplementation.add(70);
        listImplementation.display();
        listImplementation.remove(40);
        listImplementation.display();
    }
}
