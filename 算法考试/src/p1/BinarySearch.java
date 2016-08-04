package p1;
import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("二分搜索的递归实现算法");
		Scanner sc=new Scanner(System.in);
		System.out.print("先输入进行二分搜索元素的个数:");
		int n=sc.nextInt();
		System.out.print("请一次输入这"+n+"数字:");
		int a[]=new int[n];
		int high=0;
		int low=a.length-1;
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		java.util.Arrays.sort(a);
		
		System.out.print("请输入要搜索的元素：");
		int x=sc.nextInt();
		System.out.print("请输出该元素的下标:"+binarySearch(a,x,high,low));
		
	}
	
	public static int binarySearch(int a[],int x,int high,int low) {
		int mid=(high+low)/2;
		if(x==a[mid])return mid;
		else if(x<a[mid])return binarySearch(a,x,high,mid-1);
		else if(x>a[mid])return binarySearch(a,x,mid+1,low);
		else return -1;
	}
}
