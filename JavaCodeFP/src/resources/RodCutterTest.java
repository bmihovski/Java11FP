package resources;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static resources.TestHelper.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RodCutterTest {
	
	private RodCutter rodCutter;
	private List<Integer> prices;
	
	protected RodCutter createCutter() {
		return new RodCutter(false);
	}
	
	@Before
	public void initiliaze() {
		rodCutter = createCutter();
		prices = Arrays.asList(1, 1, 2, 2, 3, 4, 5);
	}
	
	
	@Test
	public void VerboseExceptionTest() {
		rodCutter.setPrices(prices);
		try {
			rodCutter.maxProfit(0);
			fail("Expected exception for zero length");
		} catch (RodCutterException ex) {
			assertTrue("expected", true);
		}
	}
	
	@Test(expected = RodCutterException.class)
	public void TerseExceptionTest() {
		rodCutter.setPrices(prices);
		rodCutter.maxProfit(0);
	}
	
	@Test
	public void ConciseExceptionTest() {
		rodCutter.setPrices(prices);
		assertThrows(RodCutterException.class, () ->
				rodCutter.maxProfit(0));
	}
	
}
