package learn;

public class StockBuySell {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		 int minprice =Integer.MAX_VALUE;
	        int mxprofit = 0;

	        for(int price: prices){
	            if(minprice>price){
	                minprice=price;
	            }
	            else {
	                mxprofit=Math.max(mxprofit,(price-minprice));
	            }
	        } System.out.println(mxprofit);

	}

}
