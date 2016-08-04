package p1;
import java.util.Scanner;
public class Ackerman {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入两个数字：");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.print("结果"+ ack(n,m));
	}
	public static int ack(int n,int m) {
		if(n==0)return 1;
		if(m==0){
			if(n==1)return 2;
			return n+2;
		}else return ack(ack(n-1,m),m-1);
	}
}
