package applying;

import java.math.BigDecimal;

public class StockInfo {
	public final String ticker;
	public final BigDecimal price;
	
	public StockInfo(final String symbol, final BigDecimal thePrice) {
		ticker = symbol;
		price = thePrice;
	}
	
	public String toString() {
		return String.format("ticke %s is price %g", ticker, price);
	}

}
