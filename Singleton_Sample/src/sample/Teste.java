package sample;
import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Soma soma = Soma.getInstance();
		
		int a = ler.nextInt();
		int b = ler.nextInt();
		ler.close();
			
		System.out.println(soma.somarNumeros(a, b));
		
	}

}
