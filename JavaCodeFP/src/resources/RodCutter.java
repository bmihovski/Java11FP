package resources;

import java.util.List;

public class RodCutter {
	
	private boolean mustFail;
	
	public RodCutter(final boolean fail) { mustFail = fail; }
	
	public void setPrices(final List<Integer> prices) {
	}
	
	public int maxProfit(final int length) {
		if (length == 0) throw new RodCutterException();
		
		return 0;
	}

}
