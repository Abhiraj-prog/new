package sorting;

public class Insertion_sort {
    public static void main(String[] args) {

        // Step 1: Initialize the array to be sorted
        int[] arry = {14, 9, 15, 12, 6, 8, 13};

        // Step 2: Get the length of the array
        int n = arry.length;

        // Step 3: Outer loop → iterate through elements starting from index 1
        // Index 0 is considered sorted initially
        for (int i = 1; i < n; i++) {

            // Step 4: Store the current element to be inserted into sorted portion
            int current = arry[i];

            // Step 5: Start comparing with the last element of the sorted portion
            int prev = i - 1;

            // Step 6: Shift elements in the sorted portion to the right until correct position is found
            // Continue while prev is within array and the element at prev is greater than current
            while (prev >= 0 && arry[prev] > current) {
                arry[prev + 1] = arry[prev];  // shift element one position to the right
                prev--;                        // move to the previous element in sorted portion
            }

            // Step 7: Insert the current element at its correct position
            arry[prev + 1] = current;
        }

        // Step 8: Print the sorted array
        for (int k = 0; k < n; k++) {
            System.out.print(arry[k] + " ");
        }
    }
}
