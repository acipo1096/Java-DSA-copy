package ds.stack;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(3);

        // System.out.println(reverseString("hello"));
        // theStack.push(20);
        // theStack.push(40);
        // theStack.push(60);
        // theStack.push(80);
        // theStack.push(100);
        // theStack.push(120);
        // theStack.push(140);
        // theStack.push(160);
        // theStack.push(180);
        // theStack.push(200);
        // theStack.push(220);
            
        // while(!theStack.isEmpty()){
        //     long value = theStack.pop();
        //     System.out.println(value);
        // }

        System.out.println(reverseString("HELLO"));
    }

    public static String reverseString(String str) {
        int stackSize = str.length(); // get the max stack size
        Stack theStack = new Stack(stackSize); // we make the stack
        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j); // getting a char from the input string
            theStack.push(ch);
        }

        String result = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch; // appending to the output
        }

        return result;
    }

}

// Assignment #1: 
// Could you make this class a more safe data structure so that if a user tries to place more elements than are allowed, it should prevent the program from crashing?

// My Attempt

// package ds.stack;
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Stack theStack = new Stack(10);


//         while(!theStack.isFull()){
//             long number = sc.nextLong();
//             theStack.push(number);
//         }

//         while(!theStack.isEmpty()){
//             long value = theStack.pop();
//             System.out.println(value);
//         }
//     }
// }

// Assignment #2 - My Attempt

// public static String reverseString(String str){     
//     String s = "";
//     char c = ' ';   
//     for (int i = str.length()-1; i >= 0; i--){
//         c = str.charAt(i);
//         s += c;
//     }

//     str = s;
//     System.out.println(str);
//     return str;
// }