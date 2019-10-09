package tarefa_3;

public class Principal {

	public static void main(String[] args) {
		/*3)Elabore uma classe que adicione o nome de 10 alunos em um vetor de String. A classe terá
			atributos de nomeCompleto e Sobrenome, sendo que o sobrenome será retirado do nome colocado.
			Ex:”Joao da Silva”, guardado na posição 3, ao chamar o método removerSobrenome, separará a
			String em 2, sendo a primeira parte “Joao da” e a última parte “Silva”. Outro exemplo, “Joao
			Miguel Arcanjo dp Carmo”. A primeira parte ficará “Joao Miguel Arcanjo do” e a última parte
			“Carmo”. Elaborar um método para mostrar as Strings.*/
	    String[] sobreNome= {}, primeiroNome= {};
		String[] nomeCompleto= {"Julia Barros Castro", "Ana Rodrigues Sousa", "Murilo Castro Martins",
				"Luis Goncalves Pereira", "Erick Souza Fernandes", "Maria Souza Araujo", 
				"Isabela Ferreira Gomes", "Guilherme Souza Silva", "Otavio Cardoso Gomes", 
				"Pedro Souza Azevedo"};
		RemoverSobrenome rn=new RemoverSobrenome();
		primeiroNome=rn.RemoveSobrenome(nomeCompleto, 1);
		sobreNome=rn.RemoveSobrenome(nomeCompleto, 2);
		
		for (int i=0; i < 10; i++) {
			System.out.println("\n"+(i+1)+"º Aluno ==> ");
			System.out.println("Primeiro Nome: "+primeiroNome[i]);
			System.out.println("Sobrenome: "+sobreNome[i]);
		}
	}
}
