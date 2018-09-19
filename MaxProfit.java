package algo.cr3;

public class MaxProfit {

	public static int maxProfit1(int[] a) {
		int profit =Integer.MIN_VALUE;
		int buy; 
		int sell;
		int min = Integer.MAX_VALUE;
		
		if(a.length<=2) {
			return -1;
		}
		
		//Iterate array to find the max profit
		for (int i=1; i<a.length; i++) {
			if (i==1) {
				buy = a[i-1];
				sell = a[i];
				min = buy<sell?buy:sell; 
				profit = a[i]-a[i-1];
			}else {
				//Update min if any element is less than buy
				if (min>a[i]) {
					min =a[i];
				}else {
					//current element is more than min, so calculate profit
					//update profit, buy and sell if current profit is more that global profit
					if(a[i]-min >profit) {
						profit = a[i]-min;
						buy = min;
						sell = a[i];
						}
					}
				}			
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int[] a = {100,90,79,68,57,46,34,21,9};
		int max = 0;
		max = maxProfit1(a);
		System.out.println("Max profit is "+max);
	}
}
