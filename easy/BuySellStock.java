package easy;


/*
 * Say you have an array for which the ith element is the price of a given stock on day i. 
 * If you were only permitted to complete at most one transaction (ie, buy one and sell 
 * one share of the stock), design an algorithm to find the maximum profit.
 */
public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[]{7,1,5,0,6,5, 4}));
	}
	
	public static int maxProfit(int[] prices) {
		if(prices == null)
			return 0;
		int profit = 0;
		int min = Integer.MAX_VALUE;
		for(int i:prices){
			min = (min>i)?i:min;
			profit = (profit<i-min)?i-min:profit;
		}
		//n*n solution
		/*
		for(int i =0; i<prices.length; i++)
			for(int j=i+1; j<prices.length; j++)
				profit = (profit<(prices[j]-prices[i]))?prices[j]-prices[i]:profit;
		*/
		
		
		return profit;
	}

}
