package p1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int b=bS(a,x,0,n-1);
		while(b==-1){
			System.out.println("该数不在数组中");
			x=sc.nextInt();
			b=bS(a,x,0,n-1);
		}
		System.out.println(b);
	}
	public static int bS(int a[],int x,int low,int high) {
		if(low>high)return -1;
		int i=(low+high)/2;
		if(a[i]==x)return i;
		if(a[i]>x)return bS(a,x,low,high-1);
		return bS(a,x,low+1,high);
		
	}
}
