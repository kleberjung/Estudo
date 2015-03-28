public class Palindrome {
	public static void main(String[] args) {
		char[] exemplo1={'a','b','c'};
		char[] exemplo2={'a','b','b','a'};
		System.out.println(teste(exemplo1));
		System.out.println(teste(exemplo2));
	
	
	}
	
	public static boolean teste(char[] palavra){
		int qtde;
		qtde = palavra.length;
		for (int i=0;i<palavra.length;i++) {
			if (palavra[i]!=palavra[qtde-1]){
				return false;
			}
			qtde--;
		}
		return true;
	}


}