package algo.binarysearchtree;

public class BST {
    
    private Node root;

    public void insert(int key, String value) {
        
        Node newNode = new Node(key, value);

        if(root == null) {
            root = newNode;
        }

        else {

            Node current = root;
            Node parent;

            while(true){
                parent = current;
                if(key < current.key) {
                    current = current.leftChild;
                    if (current == null){ // Its parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin() { // Last node that doesn't have any right child is the largest value
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.leftChild;
        }

        return last;
    }

    public Node findMax() { // Last node that doesn't have any right child is the largest value
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }

        return last;
    }

    public boolean remove(int key){

        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        // Searching to find the node with the key to delete
        while(currentNode.key != key) {
            parentNode = currentNode;
            if(key < currentNode.key){
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if(currentNode == null){
                return false;
            }
        }

        // found the node
        Node nodeToDelete = currentNode;

        // if node is a leaf

        // if node has one child

        // if node has two children (tricky)

        return true;
    }


}
