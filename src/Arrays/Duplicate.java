//Removes duplicates from an array

package Arrays;

import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int array[] ={1,1,2,2,2,3,3};

        int i =0;
        for(int j=1;j<array.length;j++){
            if (array[j] != array[i]) {
                 i++;  // move to next index
                 array[i]=array[j];  // place the unique element
            }
        }
        // Print only the unique part (from index 0 to i)
        for(int k=0;k <=i;k++){
            System.out.print(array[k] +" ");
        }
    }
}
