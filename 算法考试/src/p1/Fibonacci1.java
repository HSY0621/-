package p1;
import java.util.*;

public class Fibonacci1 {
	public static void main(String[] args) {
		System.out.println("Fibonacci的备忘录算法");
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您需要第几项Fibonacci的值：");
		int n=sc.nextInt();
		int a[]=new int[n];
		fib(n);
		for(int i=0;i<n+1;i++){//3333333333333
			System.out.print(a[i]+" ");
		}
	}
	public static int fib(int n) {
		int a[]=new int[n];
		if(n==1||n==2){
			a[n]=n;
			return a[n];
		}
		if(n==0){
			return 1;
		}
		int x=fib(n-1);
		int y=fib(n-2);
		a[n]=x+y;
		return a[n];
	}
}
