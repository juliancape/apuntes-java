package stars;

import java.util.HashMap;
import java.util.Map;
import java.awt.*;

public class StarFactory {
	 static Map<String, StarType> starTypes = new HashMap<>();

	    public static StarType getStarType(String name, Color color) {
	    	StarType result = starTypes.get(name);
	        if (result == null) {
	            result = new StarType(name, color);
	            starTypes.put(name, result);
	        }
	        return result;
	    }
}
