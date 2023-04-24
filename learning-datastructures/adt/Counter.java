package adt;

public class Counter {

    private String name = null;
    private int value = 0;
    // Reminder: private prevents people from making changes here - we don't want people changing values or names!

    public Counter(String str) {
        this.name = str;
        // Whatever is passed in the constructor will be assigned to "name"
    }

    public void increment(){
        value++;
    }

    public int getCurrentValue(){
        return value;
    }

    public String toString(){
        return name + " : " + value;
    }

}

// My Attempt Pre-Solution

// package adt;

// public class Counter {

//     int count = 0;

//     public Counter(String instanceName) {
//         this.count = count;
//     }

//     public void increment(){
//         count++;
//     }

//     public int getCurrentValue(){
//         return count;
//     }

// }