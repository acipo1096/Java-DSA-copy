package ds.stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    
    // This variable will represent the index position of the last item placed on top of the stack
    private int top;

    public Stack (int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){
        // Solution

        if (isFull()){
            System.out.println("This stack is already full!");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop(){
        // Solution
        if (isEmpty()){
            System.out.println("The stack is already empty!");

            // Need to return something because we defined this as "long"
            return '0';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }
}
