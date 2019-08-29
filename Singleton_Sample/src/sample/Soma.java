package sample;

public class Soma {
	
	static Soma soma = new Soma();
	
	private Soma() {
		
	}
	
	public static Soma getInstance() {
		return soma;
	}
	
	public  int somarNumeros(int a, int b) {
		int resultado = a + b;
		return resultado;
	}
}
