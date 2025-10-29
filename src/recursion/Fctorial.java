package recursion;

import Arrays.SortedArray;

public class Fctorial {
    public static void main(String[] args) {
        int n=5;
        int ans =Fac(n);
        System.out.println(ans);
    }

    public static int Fac(int n){
        if (n==0 ||n==1){
            return 1;
        }

        int prev =Fac(n-1);
        int facto =n*prev;
        return facto;
    }
}
