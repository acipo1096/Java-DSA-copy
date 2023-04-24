package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode; // If empty, last will refer to the new Node being created
        } 
        else {
            first.previous = newNode;
        }

        newNode.next = first; // the new node's next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        } 
        else {
            last.next = newNode; // assigning old last to newNode
            newNode.previous = last; // the old last will be the newNode's previous
        }

        last = newNode; // The linked list's last field should point to the new node
    }

    // assume non-empty list
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ // there is only one item in the list
            last = null;
        }
        else {
            first.next.previous = null; // the list's first node will point to null
        }

        first = first.next; // we are assigning the reference of the node following the first node to the first field in the linked list object
        return temp; // return the deleted old first node
    }

    // assume non-empty list
    public Node deleteLast(){
        Node temp = last;
        if(first.next == null){ // we only have one node in this list
            first = null;
        }
        else {
            last.previous.next = null; // the last node's previous node's next field will point to null
        }
        last = last.previous;
        return temp;
    }

    // assume non-empty list
    public boolean insertAfter(int key, int data){
        Node current = first; // we start from the beginning of the list
        while(current.data != key){ // as long as we have not found the key in a particular node
            current = current.next;
            if (current == null){ // we are not able to find the key we're searching for
                return false;
            }
        }
        
        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next; // new node's next field should point to the node ahead of the current
            current.next.previous = newNode;
        }

        newNode.previous = current;
        current.next = newNode;

        return true;

    }

    public Node deleteKey(int key){
        Node current = first; // start from the beginning
        while(current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }
        }

        if(current == first){ 
            first = current.next; // make the first field point to the node following current since current will be deleted
        } else {
            current.previous.next = current.next;
        }

        if(current == last){
            last = current.previous;
        }  
        else {
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward(){
        System.out.print("List (first ---> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.print("List (last ---> first) ");
        Node current = last;
        while(current != null){
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }
}
