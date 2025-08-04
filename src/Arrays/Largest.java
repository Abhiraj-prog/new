package Arrays;

public class Largest {
    public static void main(String[] args) {
        int arr[] ={3,2,1,5,2};
        int larg=Lar(arr);
        System.out.println("Largest no is : "+larg);

    }
    public static int Lar(int arr[]){
        int largest =arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
