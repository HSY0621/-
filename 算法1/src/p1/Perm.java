package p1;
import java.util.Scanner;
public class Perm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []a=new String[n];
		int low=0;
		int high=n-1;
		
		for(int i=0;i<n;i++){
			a[i]=sc.next();
		}
		
		perm(a,low,high);
	}
	
	public static void perm(String[] a,int low,int high) {
		if(low==high){
			for(int i=0;i<=high;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}else{
				for(int i=low;i<=high;i++){
					String tmp=a[low];
					a[low]=a[i];
					a[i]=tmp;
					perm(a,low+1,high);
					tmp=a[low];
					a[low]=a[i];
					a[i]=tmp;
				}
			}
	}
}

