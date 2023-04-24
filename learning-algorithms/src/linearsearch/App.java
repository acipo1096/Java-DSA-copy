package linearsearch;

public class App {

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5,6};
        int x = 5;

        System.out.println(linearSearch(a, x));
    }

    // Instructor's solution
    public static int linearSearch(int [] a, int x){
        for (int i = 0; i < a.length; i++){
            if (a[i] == x){
                return i+1; // I added the +1
            }
        }
        return -1;
    }

    // My Solution
    // public static int linearSearch(int a[], int x){
    //     int answer = -1;
    //     for (int i = 0; i < a.length; i++){
    //         if (a[i] == x){
    //             answer = a[i];
    //             return answer;
    //         }
    //         else {
    //             answer = -1;
    //         }
    //     }
    //     return answer;
    // }
}
