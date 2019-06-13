package applying;

import java.util.stream.Stream;

public class PickStockFunctional {

	public static void findHighPriced(final Stream<String> symbols) {
		final StockInfo highPriced =
				symbols.map(StockUtil::getPrice)
				       .filter(StockUtil.isPriceLessThan(500))
				       .reduce(StockUtil::pickHigh)
				       .get();
		
		System.out.println("High priced under $500 is: " + highPriced);
	}
	
	
	
	public static void main(String[] args) {
		// It's an API call it make sense to be parallel
		findHighPriced(Tickers.symbols.parallelStream());

	}

}
