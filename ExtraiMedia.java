import java.util.Scanner;

public class ExtraiMedia {

	public static float getAlta(float nota1, float nota2, float nota3) {
		float maisAlta;
		if (nota1>nota2) {
				if (nota1>nota3){
					maisAlta=nota1;
				} else {
					maisAlta=nota3;
				}
		} else {
			if (nota2>nota3) {
				maisAlta=nota2;
			} else {
				maisAlta=nota3;
			}
		}
	return maisAlta;		
	}
	
	public static float getBaixa(float nota1, float nota2, float nota3) {
		float maisBaixa;
		if (nota1<nota2) {
				if (nota1<nota3){
					maisBaixa=nota1;
				} else {
					maisBaixa=nota3;
				}
		} else {
			if (nota2<nota3) {
				maisBaixa=nota2;
			} else {
				maisBaixa=nota3;	
			}
		}
		return maisBaixa;
	}

	public static float getIntermediaria(float nota1, float nota2, float nota3) {
		float intermediaria;
		if (nota1>nota2) {
			if(nota1>nota3) {
				if(nota3<nota2) {
					intermediaria=nota2;
				} else {
					intermediaria=nota3;
				}
			} else {	
				intermediaria=nota1;
			}
		} else {
			if (nota1<nota3) {
				if (nota3<nota2) {	
					intermediaria=nota3;
				} else {
					intermediaria=nota2;
				}
			} else {
					intermediaria=nota1;
			}
		}
		return intermediaria;
	}
	
    public static float getMedia(float... valores){
		float media=0;
		for(float valor: valores){
			media +=valor;
		}
		return media/valores.length;
	}

	
	public static void main(String[] args) {
		String nome;
		float nota1, nota2, nota3;
        Scanner entrada = new Scanner(System.in);
	
		System.out.println("# # # Entrada de valores # # #");
        System.out.print("Nome do aluno: ");
		nome = entrada.nextLine();
        System.out.print("Primeira nota: ");
		nota1 = entrada.nextFloat();		
		System.out.print("Segunda nota: ");
		nota2 = entrada.nextFloat();
        System.out.print("Terceira nota: ");
		nota3 = entrada.nextFloat();
		
		System.out.println("\n# # # Valores # # #");		
		System.out.println("Aluno: "+ nome);
		System.out.println("Nota 1: "+ nota1);
		System.out.println("Nota 2: "+ nota2);
		System.out.println("Nota 3: "+ nota3);
		
		System.out.println("\n# # # Resultados # # #");		
		System.out.println("Nota mais alta: "+ getAlta(nota1,nota2,nota3));
		System.out.println("Nota intermediária: "+ getIntermediaria(nota1,nota2,nota3));
		System.out.println("Nota mais baixa:  "+ getBaixa(nota1,nota2,nota3));
		System.out.println("Média com três notas:  "+getMedia(nota1,nota2,nota3));
		System.out.println("Média com mais altas:  "+getMedia(getAlta(nota1,nota2,nota3),getIntermediaria(nota1,nota2,nota3)));
	}
}