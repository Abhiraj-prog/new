package recursion;

public class Febonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        febo(n-2,a,b);
    }

    public static void febo(int n,int a, int b){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        febo(n-1,b,c);
    }
}
