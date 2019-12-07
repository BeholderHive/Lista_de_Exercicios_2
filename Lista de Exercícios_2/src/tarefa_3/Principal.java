package tarefa_3;

public class Principal {

	public static void main(String[] args) {
		/*3)Elabore uma classe que adicione o nome de 10 alunos em um vetor de String. A classe tera
			atributos de nomeCompleto e Sobrenome, sendo que o sobrenome sera retirado do nome colocado.
			Ex:”Joao da Silva”, guardado na posicao 3, ao chamar o metodo removerSobrenome, separara a
			String em 2, sendo a primeira parte “Joao da” e a ultima parte “Silva”. Outro exemplo, “Joao
			Miguel Arcanjo dp Carmo”. A primeira parte ficará “Joao Miguel Arcanjo do” e a última parte
			“Carmo”. Elaborar um método para mostrar as Strings.*/
		String[] nc= {"Julia Barros Castro", "Ana Rodrigues Sousa", "Murilo Castro Martins",
				"Luis Goncalves Pereira", "Erick Souza Fernandes", "Maria Souza Araujo", 
				"Isabela Ferreira Gomes", "Guilherme Souza Silva", "Otavio Cardoso Gomes", 
				"Pedro Souza Azevedo"};
		RemoverSobrenome rn=new RemoverSobrenome();
		rn.setNomeCompleto(nc);
		rn.setNome(rn.RemoveSobrenome(rn.getNomeCompleto(), 1));
		rn.setSobreNome(rn.RemoveSobrenome(rn.getNomeCompleto(), 2));
		
		for (int i=0; i < 10; i++) {
			System.out.println("\n"+(i+1)+"º Aluno ==> ");
			System.out.println("Primeiro Nome: "+rn.getNome()[i]);
			System.out.println("Sobrenome: "+rn.getSobreNome()[i]);
		}
	}
}
