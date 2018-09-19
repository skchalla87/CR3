package algo.cr3;

public class SearchRotatedArray {
	
	public static int serachRotArray1(int[] a, int key) {//Coderust solution.
		int low=0;int high=a.length-1; int mid=0;
		System.out.println("Values of low,mid and high are:"+ low+" "+mid+" "+high);
		while(high>low) {
			mid = (low+high)/2;
			
     		System.out.println("Values of low,mid and high are:"+ low+" "+mid+" "+high);
			if(a[mid]==key) {
				return mid;
			}
			    if (a[low] < a[mid] && 
			        key < a[mid] && key >= a[low]) {
			      high= mid-1;
			    }
			    else if (a[mid] < a[high] && 
			             key > a[mid] && key <= a[high]) {
			      low=mid+1;
			    }
			    else if (a[low] > a[mid]) {
			      high=mid-1;
			    }
			    else if (a[high] < a[mid]) {
			      low=mid+1;
			    }

			System.out.println("Values of low,mid and high are:"+ low+" "+mid+" "+high);
			}
		return -1;
	}
 
	public static int serachRotArray(int[] a, int key) {//skchalla solution
		int low=0;int high=a.length-1; int mid=0;
		System.out.println("Values of low,mid and high are:"+ low+" "+mid+" "+high);
		while(high>low) {
			mid = (low+high)/2;
			
     		System.out.println("Values of low,mid and high are:"+ low+" "+mid+" "+high);
			if(a[mid]==key) {
				return mid;
			}
			if(a[low]==key) {
				return low;
			}
			if(a[high]==key) {
				return high;
			}
			
			if(a[mid]<key && a[high]>key ||!(a[mid]>key && a[low]<key)) {
				low = mid+1;
			}else {
				high = mid+1;
				}
			System.out.println("Values of low,mid and high are:"+ low+" "+mid+" "+high);
			}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 14, 15, 16, 1, 2, 3, 4, 5,6, 7, 8, 9, 10, 11, 12, 13};
		int index;
		for (int i =0; i<a.length;i++) {
			System.out.print("Ind"+i+": "+a[i]+"  ");
		}
		System.out.println("\n");
		index = serachRotArray(a,8);		
		
		System.out.printf("Index of the key 8 is %d",index);
	}
}
