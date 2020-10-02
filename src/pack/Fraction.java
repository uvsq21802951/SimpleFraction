package pack;

public class Fraction {
	
	private int num;
	private int deno;
	
	public Fraction(int num, int deno) {
		this.num = num;
		this.deno = deno;
	}
	
	void afficher() {
		System.out.println(this.num + " / " + this.deno);
	}

}
