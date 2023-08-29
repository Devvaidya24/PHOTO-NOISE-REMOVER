// CollectionSort.java file

/*
Q1) Is quick sort the best way of finding median? Why?
Answer: Quick Sort is not the best way to find the median as it used for
sorting arrays which wont directly find median

Q2) What is another good way of finding median? Please provide your explaination
Answer: Another good way of finding median is QuickSelect where its time
complexity is very good compared to other methods.
 */
package noiseremoving;

/**
 * @param <E>
 * @author Dev
 */
public class CollectionSort<E extends Comparable<E>> {

    // Declaring an array for type E array
    private E[] arr;

    // Set method for array
    public void setArray(E[] arr) {
        // Sets array to the input array
        this.arr = arr;
    }

    // Public method to perform quick sort method
    public void quickSort() {
        // Calls the private quick sort method with the left and right of array
        quickSort(0, arr.length - 1);
    }

    // Private swap method for swapping the arrays elements
    private void swap(int x, int y) {
        //Swaps the elements
        E z = arr[x];
        arr[x] = arr[y];
        arr[y] = z;
    }

    // Private quick sort method that contains the algorithm
    private int quickSortAlgorithm(int left, int right) {

        // Declaring the first element of the array as the pivot
        E piv = arr[left];

        int x = left;
        int y = right + 1;

        // While loop is true for...
        while (true) {

            // Increments x while arr[x] is less than the pivot
            while (arr[++x].compareTo(piv) < 0) {
                if (x == right) {
                    break;
                }
            }

            // Decrements y while arr[y] is greater than the pivot
            while (arr[--y].compareTo(piv) > 0) {
                if (y == left) {
                    break;
                }
            }

            // If method for x and y cross where partitioning occurs
            if (x >= y) {
                break;
            }

            // Swaps the x array and y array
            swap(x, y);

        }

        // Puts the pivots in its correct position
        swap(left, y);

        // Returns the index of the pivot
        return y;
    }

    // A private quick sort method to perform the quick sort recursively
    private void quickSort(int left, int right) {

        // If method array has more than one element
        if (left < right) {

            // Partitioning the array and gets the pivots index
            int pivot = quickSortAlgorithm(left, right);

            // Recursively sorts the sub arrays to the left and right of pivot
            quickSort(left, pivot - 1);
            quickSort(pivot + 1, right);
        }
    }
}
