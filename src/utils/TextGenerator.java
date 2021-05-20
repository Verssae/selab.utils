package utils;

public class TextGenerator {
	public TextGenerator() {
        
    }
    
    public String makeText(String origin, int mult) {
            String r = "";
            for (int i = 0; i < mult; i++) {
                    r += origin;
            }
            return r;
    }
    
    public String reverseText(String origin) {
            return new StringBuffer(origin).reverse().toString();
    }
    
    public String halfText(String origin) {
            return origin.substring(0, origin.length()/2);
    }
    
    public String halfText2(String origin) {
            String r = "";
            for (int i = 0; i <= origin.length()/2; i++) {
                    r += origin.charAt(i);
            }
            return r;
    }
}
