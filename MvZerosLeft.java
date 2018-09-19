package algo.cr3;

import java.util.Arrays;

public class MvZerosLeft {
	public static void mvZeros(int[] a) {
		int read= a.length-1;
		int write= a.length-1;
		
		while (read >-1 || write >-1) {
			if (read!=-1) {
				if (a[read]==0) {
					read--;
				}else if (a[read]!=0) {
					a[write] = a[read];
					write--;
					read--;
				}
			}
			if(read==-1 && write!=-1 ) {
				a[write]=0;
				write--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1, 10, 20, 0, 59, 63, 0, 88, 0,0,0,1,2,3,0,9,8,77,0,44};
		System.out.println("Original Array: "+ Arrays.toString(a));
		mvZeros(a);
		//for(int i=0; i<a.length;i++) {
			//System.out.println("Ind"+i+" :"+a[i]);
		//}
		System.out.println("After Array: "+ Arrays.toString(a));
		
	}
	
}
