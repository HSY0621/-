package p1;

import java.util.Scanner;

public class Main2 {
	public static int fib[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fib=new int[n+1];
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		int t=0;
		if(fib[n]!=0)return fib[n];
		if(n==0||n==1)t=1;
		if(n>1)t=fib(n-1)+fib(n-2);
		return t;
	}
}
