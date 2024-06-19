package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet {
	
	private String text;
	
	
	public boolean setText(String text) {
		if(text.length()>280) return false;
		this.text = text;
		return true;
	}
	
	
	@Override
	public String toString() {
		return this.text;
	}

}
