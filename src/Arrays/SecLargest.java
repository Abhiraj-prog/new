package Arrays;

public class SecLargest {
    public static void main(String[] args) {
        int arr[] ={1,2,4,7,7,5};

        secLarg(arr);
    }

    public static void secLarg(int arr[]){
        int largest=arr[0];
        int seclargest=-1;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            } else if (arr[i]>seclargest && arr[i]<largest) {
                seclargest=arr[i];
            }
        }
        System.out.println("Second largest number in the array is -->"+seclargest);
    }
}
