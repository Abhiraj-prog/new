package Basic;

import java.util.Scanner;

public class DigitOfNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

//        int count =0;      //print digits but in reverse order
//        while(num>0){
//            int rem=num%10;
//            num =num/10;
//            System.out.println(rem);
//        }

        int nod=0; //no of digits in num
        int temp =num;

        while (temp!=0){
            temp=temp/10;
            nod++;
        }

        int divisor =(int) Math.pow(10,nod-1);
        while(divisor!=0){
           int q =num/divisor;
            System.out.println(q);
            num=num%divisor;
            divisor=divisor/10;

        }
    }
}
