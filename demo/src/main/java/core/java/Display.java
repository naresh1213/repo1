package core.java;
@FunctionalInterface
public interface Display {
	
	public String hell();
	
	public default String h(){
		return "";
	}
	public static String h2(){
		return "";
	}
	
}
