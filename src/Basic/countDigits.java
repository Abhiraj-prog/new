package Basic;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no");
        int no= sc.nextInt();
        int count =0;
        while(no>0){
            no =no/10;
            count++;
        }
        System.out.println(count);
    }
}
