package sorting;

public class Selection_sort {
    public static void main(String[] args) {
    int [] arr ={13,46,24,52,20,9};
    int n =arr.length;
    for(int i=0;i<n;i++){
        int mini=i;
        for(int j=i;j<n;j++){
            if (arr[j]<arr[mini]){
                mini=j;
            }
        }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini] =temp;

    }
        for (int k=0;k<n;k++){
            System.out.print(arr[k] +" ");
        }
    }
}
