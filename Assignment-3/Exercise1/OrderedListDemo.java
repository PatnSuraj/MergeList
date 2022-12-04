import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// OrderedListDemo class
public class OrderedListDemo {
    //  returns a method that gives a third list that is a merger of the two ordered lists
    public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2) {
        // Result object (Third list)
        OrderedList mergedResult = new OrderedList();

        // for loop inserts the values contained in the list1
        for(int firstList = 0;firstList < list1.size();firstList++) {
            mergedResult.insert(list1.get(firstList));
        }

        // for loop inserts the values contained in the list2
        for(int secondList = 0;secondList< list2.size();secondList++) {
            mergedResult.insert(list2.get(secondList));
        }

        // returns the merge values of two lists
        return mergedResult;
    }

    // Main method
    public static void main(String[] args) throws IOException {
        // OrderedList objects names1 and names2
        OrderedList names1 = new OrderedList();
        OrderedList names2 = new OrderedList();
        // Scanner object
        Scanner in = new Scanner(System.in);
        // Asking the user to enter the file names
        System.out.print("Enter the first filename to read from: ");
        String firstFile = in.next();
        System.out.print("Enter the second filename to read from: ");
        String secondFile = in.next();

        // opening the first file
        File fileName = new File(firstFile);
        in = new Scanner(fileName);
        // while loop to read the content in the file
        while (in.hasNextLine()) { names1.insert(in.nextLine()); }

        // opening the second file
        fileName = new File(secondFile);
        in = new Scanner(fileName);
        // while loop to read the content in the file
        while (in.hasNextLine()) { names2.insert(in.nextLine()); }

        // printing the outputs
        System.out.println("The Ordered Lists contain the following entries:");
        System.out.print("List 1:\n");
        // List-1 values
        names1.enumerate();
        System.out.print("List 2:\n");
        // List-2 values
        names2.enumerate();
        // merged resultant values
        System.out.println("\nA merged version of the two lists looks like this: ");
        // Merged values from both lists
        merge(names1,names2).enumerate();
    }
}
