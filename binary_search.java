package algo.general;

public class binary_search {

	public static int bin_search(int[] a, int key) {
		    //TODO: Write - Your - Code
		    int mid=0; 
		    int low=0; 
		    int high = a.length-1;
		    while ( high > low ){
		      mid = (low+high )/2;
		      
		      if (a[mid] ==key) 
		        return mid;
		      if (key > a[mid] )
		        low = mid+1;
		      if (key < a[mid])
		        high = mid-1;    
		    }
		    return low;
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int[] a = new int[n];
		for (int i =1;i<n;i++) {
			a[i-1] = Integer.parseInt(args[i]);			
		}
		
		System.out.println("length of array is:" + a.length);
		System.out.println("a[0] is:" + a[0]);
		System.out.println("a[8] is:" + a[8]);
		System.out.println("a[9] is:" + a[9]);
		int index = bin_search(a, Integer.parseInt(args[n+1]));
		System.out.println("index of the element is: "+index);
	}
}
