class TrocaCaracter {

	public static String troca(String s){
			s=s.toLowerCase();
			s=s.replace("a","2");
			s=s.replace("b","2");
			s=s.replace("c","2");
			s=s.replace("d","3");
			s=s.replace("e","3");
			s=s.replace("f","3");
			s=s.replace("g","4");
			s=s.replace("h","4");
			s=s.replace("i","4");
			s=s.replace("j","5");
			s=s.replace("k","5");
			s=s.replace("l","5");
			s=s.replace("m","6");
			s=s.replace("n","6");
			s=s.replace("o","6");
			s=s.replace("p","7");
			s=s.replace("q","7");
			s=s.replace("r","7");
			s=s.replace("s","7");
			s=s.replace("t","8");
			s=s.replace("u","8");
			s=s.replace("v","8");
			s=s.replace("w","9");
			s=s.replace("x","9");
			s=s.replace("y","9");
			s=s.replace("z","9"); 
			return s;
	}


	public static void main(String[] args) {
		//System.out.println("Bem vindo, Gumercindo!");
		if (args.length > 0) {
			System.out.println(troca(args[0]));
		}
	}
}

//https://github.com/kleberjung/Estudo.git
