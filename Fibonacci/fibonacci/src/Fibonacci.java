import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static int f1(int n){
        if(n<=1){
            return n;
        }
        return f1(n-1)+f1(n-2);
    }
    public static int f2(int n){
        if(n<=1){
            return n;
        }
        int pre=0;
        int cur=1;
        int temp;
        for(int i=0;i<n-1;i++){
            temp=cur;
            cur=pre+cur;
            pre=temp;
        }
        return cur;
    }
    public static int f3(int n){
        if(n<=1){
            return n;
        }
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(0);
        a.add(1);
        for(int i=2;i<=n;i++){
            a.add(a.get(i-1)+a.get(i-2));
        }
        return a.get(n);
        /*int[] a=new int[3000];
        a[0]=0;
        a[1]=1;
        for (int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];*/
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f1(n));
        System.out.println(f2(n));
        System.out.println(f3(n));
    }
}
