package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first;
    // try to create a more efficient insertLast - my attempt
    private Node last;
    
    public SinglyLinkedList(){
        
    }

    // If first points to null, that means we have no nodes connected to this "train"
    public boolean isEmpty(){
        return first == null;
    }

    // Used to insert at the beginning of the list
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first ---> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data){
        // From tutorial
        Node current = first;
        while (current.next != null){
            current = current.next; // we'll loop until current.next is full
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;

        // More efficient way - my attempt
        // Node newNode = new Node();
        // newNode.data = data;
        // newNode.next = first;
        // last = first;
        // newNode.next = last;
        // last = newNode;
        // System.out.println(newNode.data);
    }

}
