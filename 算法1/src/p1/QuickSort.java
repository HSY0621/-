package p1;

import java.util.Scanner;

public class QuickSort {
	public static int[]a;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		qs(0,n-1);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void qs(int low,int high) {
		if(low<high){
			int m=s(low,high);
			qs(low,m-1);
			qs(m+1,high);
		}
	}
	public static int s(int low,int high) {
		int x=low;
		int y=high+1;
		int z=a[low];
		while(true){
			while(a[++x]<a[low]&&x<high);
			while(a[--y]>a[low]);
			if(x>=y)break;
			int tmp=a[y];
			a[y]=a[x];
			a[x]=tmp;
		}
		a[low]=a[y];
		a[y]=z;
		return y;
	}
}
