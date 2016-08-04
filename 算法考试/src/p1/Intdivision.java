package p1;
import java.util.*;

public class Intdivision {
	public static void main(String[] args) {
		System.out.println("整数划分的递归实现算法");
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入整数划分的整数：");
		int n=sc.nextInt();
		System.out.print("整数划分后个数："+q(n,n));
		
	}
	public static int q(int n,int m) {
		if(n<1||m<1)return 0;
		else if(n==1||m==1)return 1;
		else if(n<m)return q(n,n);
		else if(n==m)return 1+q(n,n-1);
		else return q(n,m-1)+q(n-m,m);
	}
}
	
