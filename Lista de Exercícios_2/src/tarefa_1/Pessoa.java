package tarefa_1;

public class Pessoa extends Operacoes{

    String nome="";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	

	int passosCaminhados= 0;
	public int getTotalPassos() {
		return passosCaminhados;
	}
	public void setTotalPassos(int totalPassos) {
		this.passosCaminhados = totalPassos;
	}
	
	@Override
	public int mostraPessoa(String operacao) {
		if(operacao=="!") {
			System.out.println("Pessoa: "+nome);
			System.out.println("Passos Caminhados: "+passosCaminhados);
		}return 0;
	}
	
	@Override
	public int mostraPassos(String operacao) {
		if(operacao=="=") {
			System.out.println("O número total de passos foi: "+passosCaminhados);
		}return 0;
	}
}
