package Basic;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to check");
        int no=sc.nextInt();
        int count =0;

        if (no<=1){
            System.out.println("Not a prime");
            return;
        }

//        for (int i=1;i<=no;i++){
        for(int i=2;i*i<=no;i++){
            if (no%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Prime no");
        }else{
            System.out.println("Not a prime no");
        }
    }
}
