package operacaoNumeros;

public class OperacoesNumeros {
	public static void main(String[]args) {
		
		/*int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;*/
		
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		
		/*acrescentando double para mostrar media real sem altera��o do resultado*/
		double mediaFinal;
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//System.out.println("M�dia das notas = " + (nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.println("M�dia das notas = " + mediaFinal);
		
		/*CHAR � representado por um caracter (uma letra) e vai em aspas simples*/
		char letra = 'F';
		
		System.out.println("A letra do caracter � " + letra);
		
		char generoPessoa = 'M';
		
		if(generoPessoa == 'M') {
			System.out.println("Pessoa do genero Masculino");
		}
		else {
			System.out.println("Pessoa do genero Feminino");
		}
		
		/*String no java sempre sera para texto de algum tipo de tamanho*/
		String nomeQualquer = "piusdgcbkjpj9990 bb643 piubqsdbdkjb �b abs";
		
		System.out.println(nomeQualquer);
		
		String nome = "Pedro";
		String tel = "51 999999999";
		String endereco = "Rua Pedro Silveira Sim�o 400";
		String cpf = "999999999-99";
		
		/*Concatena��o � unir ou juntar dados para serem mostrados com algum sentido*/
		System.out.println(nome + ", portador do CPF n� " + cpf + ", reside no endere�o: " + endereco + " e com telefone " + tel);
		
		/*ou pode ser adicionada em uma variavel para s� depois printala na tela*/
		String saida = nome + ", portador do CPF n� " + cpf + ", reside no endere�o: " + endereco + " e com telefone " + tel;
		
		System.out.println(saida);
	}
}
