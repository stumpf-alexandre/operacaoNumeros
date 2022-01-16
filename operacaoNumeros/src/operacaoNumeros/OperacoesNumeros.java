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
		
		/*acrescentando double para mostrar media real sem alteração do resultado*/
		double mediaFinal;
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.println("Média das notas = " + mediaFinal);
		
		/*CHAR é representado por um caracter (uma letra) e vai em aspas simples*/
		char letra = 'F';
		
		System.out.println("A letra do caracter é " + letra);
		
		char generoPessoa = 'M';
		
		if(generoPessoa == 'M') {
			System.out.println("Pessoa do genero Masculino");
		}
		else {
			System.out.println("Pessoa do genero Feminino");
		}
		
		/*String no java sempre sera para texto de algum tipo de tamanho*/
		String nomeQualquer = "piusdgcbkjpj9990 bb643 piubqsdbdkjb çb abs";
		
		System.out.println(nomeQualquer);
		
		String nome = "Pedro";
		String tel = "51 999999999";
		String endereco = "Rua Pedro Silveira Simão 400";
		String cpf = "999999999-99";
		
		/*Concatenação é unir ou juntar dados para serem mostrados com algum sentido*/
		System.out.println(nome + ", portador do CPF nº " + cpf + ", reside no endereço: " + endereco + " e com telefone " + tel);
		
		/*ou pode ser adicionada em uma variavel para só depois printala na tela*/
		String saida = nome + ", portador do CPF nº " + cpf + ", reside no endereço: " + endereco + " e com telefone " + tel;
		
		System.out.println(saida);
	}
}
