package p1;
import java.util.*;

public class Ackerman {
	public static void main(String[] args) {
		System.out.println("Ackerman�����ĵݹ�ʵ���㷨");
		Scanner sc=new Scanner(System.in);
		System.out.print("�������������֣�");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.print("���Ϊ"+ackerman(n,m));
	}
	
	public static int ackerman(int n,int m) {
		if(n==0){
			return 1;
		}else if(m==0){
			if(n==1){
				return 2;
			}else{
				return n+2;
			}
		}else{
			return ackerman(ackerman(n-1,m),m-1);
		}
	}
}
