package p1;
import java.util.*;

public class BinarySearch2 {
	public static void main(String[] args) {
		System.out.println("���������ĵݹ�ʵ���㷨");
		Scanner sc=new Scanner(System.in);
		System.out.print("��������ж�������Ԫ�صĸ���:");
		int n=sc.nextInt();
		System.out.print("��һ��������"+n+"����:");
		int a[]=new int[n];
		int high=0;
		int low=a.length;
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		java.util.Arrays.sort(a);
		
		System.out.print("������Ҫ������Ԫ��:");
		int x=sc.nextInt();
		
		System.out.print("��������:"+binarySearch(a,x,high,low));
	}
	
	public static int binarySearch(int a[],int x,int high,int low) {
		int mid=(high+low)/2;
		if(x==a[mid])return mid;
		else if(x<a[mid])return binarySearch(a,x,high,mid-1);
		else if(x>a[mid])return binarySearch(a,x,mid+1,low);
		else return -1;
	}
}
