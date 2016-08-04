package p1;
import java.util.*;

public class Fibonacci2 {
	public static void main(String[] args) {
		System.out.println("Fibonacci的动态规划算法");
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您需要第几项Fibonacci的值：");
		
		int n=sc.nextInt();//1111111111111
		int a[]=new int[n+1];
		a[0]=1;
		a[1]=1;
		
		for(int i=2;i<n+1;i++){//2222222222222
			a[i]=a[i-1]+a[i-2];
		}
		
		for(int i=0;i<n+1;i++){//3333333333333
			System.out.print(a[i]+" ");
		}
	}
}
