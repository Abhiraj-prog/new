package sorting;

public class Selection_sort {
    public static void main(String[] args) {

        // Step 1: Initialize the array
        int[] arr = {13, 46, 24, 52, 20, 9};

        // Step 2: Store array length
        int n = arr.length;

        // Step 3: Outer loop – runs n-1 times (each time puts one element in correct position)
        for (int i = 0; i < n; i++) {

            // Assume the first element of the unsorted part is the smallest
            int mini = i;

            // Step 4: Inner loop – find the index of the smallest element in the remaining array
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[mini]) {   // if a smaller element is found
                    mini = j;               // update index of the new smallest element
                }
            }

            // Step 5: Swap the smallest element found with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

        // Step 6: Print the sorted array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
