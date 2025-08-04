//Check is the array is sorted or not

package Arrays;

public class SortedArray {
    public static void main(String[] args) {
       int arr[] ={1,2,2,3,3,4};
       boolean isSorted =true; // Start by assuming the array is sorted

       for (int i=1;i<arr.length;i++) {
           if (arr[i]<arr[i-1]){
            isSorted =false; // If any pair is out of order, mark it unsorted
            break; // No need to check further
           }
       }
       if (isSorted){
           System.out.println("Sorted array");
       }else {
           System.out.println("Array is not sorted");
       }
    }
}
