package p1;

public class Sort {
	public static void main(String[] args) {
		int[] a = new int[]{3,2,1};
		sort(a);
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sort(int[] a ) {
		for(int i=0;i<a.length-1;i++){
			for(int j =0;j<a.length-1-i;j++){
				int tmp=0;
				if(a[j]>a[j+1]){
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
}
