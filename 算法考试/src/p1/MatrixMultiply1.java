package p1;
import java.util.Scanner;

public class MatrixMultiply1{
	static int[][]s=new int[100][100];
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入矩阵的个数：");
		int n=sc.nextInt();
		
		int[] p=new int[n+1];
		
		for(int i=0;i<=n;i++){
			p[i]=sc.nextInt();
		}
		
		int u=rmc(1,n,p);
		print(1,n);
		System.out.println();
	}
	
	public static int rmc(int m,int n,int[] p){
		if(m==n)return 0;
		int u=rmc(m,m,p)+rmc(m+1,n,p)+p[m-1]*p[m]*p[n];
		s[m][n]=m;
		
		for(int k=m+1;k<n;k++){
			int t=rmc(m,k,p)+rmc(k,n,p)+p[m-1]*p[k]*p[n];
			if(t<u){
				u=t;
				s[m][n]=k;
			}
		}
		return u;
	}
	
	public static void print(int m,int n){
		if(m==n){
			System.out.print("A"+m);
			return;
		}else{
			System.out.print("(");
			print(m,s[m][n]);
			print(s[m][n]+1,n);
			System.out.print(")");
		}
	}
}