package p1;
import java.util.*;

public class perm {
	public static void main(String[] args) {
		System.out.println("ȫ���еĵݹ�ʵ���㷨");
		Scanner sc=new Scanner(System.in);
		System.out.print("����Ҫ�����ַ��ĸ�����");
		int n=sc.nextInt();
		System.out.print("��������"+n+"���ַ�:");
		String[] a=new String[n];
		int high=0;
		int low=a.length-1;
		
		for(int i=0;i<n;i++){
			a[i]=sc.next();
		}
		
		perm(a,high,low);
	}
	public static void perm(String a[],int high,int low) {
		if(high==low){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+"\t");
			}
			System.out.println();
		}else{
			for(int j=high;j<a.length;j++){
				String tmp=a[high];
				a[high]=a[j];
				a[j]=tmp;
				perm(a,high+1,low);
			    tmp=a[high];
				a[high]=a[j];
				a[j]=tmp;
			}
		}
	}
}
