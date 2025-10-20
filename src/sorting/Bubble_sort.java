package sorting;

public class Bubble_sort {
    public static void main(String[] args) {

        // Step 1: Initialize the array to be sorted
        int[] nums = {13, 46, 24, 52, 20, 9};

        // Step 2: Store the length of the array
        int n = nums.length;

        // Step 3: Outer loop → runs (n-1) times at most
        // Each pass "bubbles" the largest remaining element to the end
        for (int i = 0; i < n - 1; i++) {

            int didSwap = 0;  // flag to check if any swapping happened in this pass

            // Step 4: Inner loop → compare adjacent elements
            // After each pass, the last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {

                // Compare current element with next element
                if (nums[j] > nums[j + 1]) {

                    // Step 5: Swap if elements are in wrong order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    didSwap = 1; // mark that a swap occurred
                }
            }

            // Step 6: Optimization — if no swap occurred, array is already sorted
            if (didSwap == 0) {
                break;
            }
        }

        // Step 7: Print the sorted array
        for (int k = 0; k < n; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
