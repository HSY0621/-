package p1;
import java.util.*;

public class Intdivision {
	public static void main(String[] args) {
		System.out.println("�������ֵĵݹ�ʵ���㷨");
		Scanner sc=new Scanner(System.in);
		System.out.print("�������������ֵ�������");
		int n=sc.nextInt();
		System.out.print("�������ֺ������"+q(n,n));
		
	}
	public static int q(int n,int m) {
		if(n<1||m<1)return 0;
		else if(n==1||m==1)return 1;
		else if(n<m)return q(n,n);
		else if(n==m)return 1+q(n,n-1);
		else return q(n,m-1)+q(n-m,m);
	}
}
	
