package p1;

import java.util.Scanner;

public class Main {
	public static int[]b;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		b=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		ms(a,0,n-1);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void ms(int[] a,int low,int high) {
		if(low<high){
			int mid=(low+high)/2;
			ms(a,low,mid);
			ms(a,mid+1,high);
			merge(a,low,mid,high);
			copy(a,low,high);
		}
	}
	public static void merge(int[] a,int low,int mid,int high) {
		int x=low;
		int y=mid+1;
		int z=low;
		while(x<=mid&&y<=high){
			if(a[x]<a[y])b[z++]=a[x++];
			else b[z++]=a[y++];
		}
		if(x<=mid){
			for(int i=x;i<=mid;i++){
				b[z++]=a[i];
			}
		}else{
			for(int i=y;i<=high;i++){
				b[z++]=a[i];
			}
		}
	}
	public static void copy(int[] a,int low,int high) {
		for(int i=low;i<=high;i++){
			a[i]=b[i];
		}
	}
}
