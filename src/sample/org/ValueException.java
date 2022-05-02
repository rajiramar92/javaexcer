package sample.org;

public class ValueException extends Exception {
	
	@Override
	public String getMessage() {
		String s="value is wrng";
		return s;
	}
	

}
