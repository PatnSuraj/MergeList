// Recursion exercise class
public class RecursionExercises {
    // recursion method squares holds an integer argument n, which returns sum of the squares of all the digits up to and including the integer.
    public static int squares(int n) {
        // base case
        if (n == 0) {
            return n;
        }
        // recursive call
        return n*n+squares(n-1);
    }

    // recursion method reverseString holds a string and integer argument, which returns the passed in string in reverse order starting from a specified index.
    public static String reverseString(String n, int i) {
        if(i == n.length()) {
            return "";
        } else {
            int a = n.length()-1-i;
            int b = n.length()-i;
            // recursive call
            return n.substring(a,b)+reverseString(n,i+1);
        }
    }
    // main method
    public static void main(String[] args) {
        // Outputs
        System.out.println("\nThe sum of the squares up to 6 is: "+squares(6));
        System.out.println("The sum of the squares up to 10 is: "+squares(10));
        System.out.println("\nStarting word is Data_Structures, reversed from index 6 is "+reverseString("Data_Structures", 6)+".");
        System.out.println("Starting word is Algorithms, reversed from index 4 is "+reverseString("Algorithms", 4)+".");
    }
}
