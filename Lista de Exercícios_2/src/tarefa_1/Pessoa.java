package tarefa_1;

public class Pessoa extends Operacao {

    private String nome="";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	

	private int pegadas = 0;
	public int getPegadas() {
		return pegadas;
	}
	public void setPegadas(int pegadas) {
		this.pegadas = pegadas;
	}
	
	@Override
	public int pessoa(String operacao) {
		if(operacao=="!") {
			System.out.println("pessoa: "+nome);
			System.out.println("Passos Caminhados: "+ pegadas);
		}return 0;
	}
	
	@Override
	public int showPegadas(String operacao) {
		if(operacao=="=") {
			System.out.println("O número total de passos foi: "+ pegadas);
		}return 0;
	}
}
