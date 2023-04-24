package ds.doublylinkedlist;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.insertFirst(88);
        myList.insertFirst(87);
        myList.insertFirst(86);
        myList.insertLast(89);

        myList.displayForward();
        myList.displayBackward();
    }
}
