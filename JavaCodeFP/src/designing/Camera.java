package designing;

import java.awt.Color;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class Camera {
	private Function<Color, Color> filter;
	
	public Color capture(final Color inputColor) {
		final Color processedColor = filter.apply(inputColor);
		
		return processedColor;
	}
	
	public void setFilters(final Function<Color, Color>... filters) {
		filter = 
			Stream.of(filters)
				  .reduce((filter, next) ->
				  		filter.compose(next))
				  .orElseGet(Function::identity);				  
	}

	public Camera() { setFilters(); }
	
	public static void main(String[] args) {
		final Camera camera = new Camera();
		final Consumer<String> printedCaptured =
				(filterInfo) ->
		System.out.println(String.format("with %s: %s",
				filterInfo,
				camera.capture(new Color(200, 100, 200))));
		
		printedCaptured.accept("no filter");
		
		camera.setFilters(Color::brighter);
		
		printedCaptured.accept("brighter filter");
		
		camera.setFilters(Color::darker);
		
		printedCaptured.accept("darker filter");
		
		camera.setFilters(Color::brighter, Color::darker);
		
		printedCaptured.accept("brighter & darker filter");
		

	}

}
