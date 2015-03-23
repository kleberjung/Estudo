public class Fatorial {

	public static void main(String[] args) {
		int numero = 4;
		System.out.println("Fatorial de: "+numero);
		System.out.println("  -  Valor:  "+fatorial(numero));
	
	}
	
	public static int fatorial(int numero) {
		if (numero <= 1) {
			return 1;
		} else {
			return fatorial(numero -1)*numero;
		}

	}
}