package pack;

public class Fraction {
	
	private int num;
	private int deno;
	
	public Fraction(int num, int deno) {
		this.num = num;
		this.deno = deno;
	}
	
	public String toString() {
		return this.num + " / " + this.deno;
	}

}
