package p1;

import java.util.Scanner;

public class IntDivision {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(q(n,n));
	}
	public static int q(int n,int m){
		if(n<1||m<1)return 0;
		if(n==1||m==1)return 1;
		if(n==m)return q(n,n-1)+1;
		return q(n,m-1)+q(n-m,m);
	}
	
}
