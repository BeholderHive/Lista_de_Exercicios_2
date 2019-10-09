package tarefa_4;

public class FiguraGenerica extends Base{

    String nome="";
    int pontox=0, pontoy=0;
    int[] pontos = {pontox,pontoy};
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
			
	public int getPontox() {
		return pontox;
	}
	public void setPontox(int pontox) {
		this.pontox = pontox;
	}
	public int getPontoy() {
		return pontoy;
	}
	public void setPontoy(int pontoy) {
		this.pontoy = pontoy;
	}
	public int[] getPontos() {
		return pontos;
	}
	public void setPontos(int[] pontos) {
		this.pontos = pontos;
	}
	@Override
	public int mostraFigura(String operacao) {
		if(operacao=="!") {
			System.out.println("Local: "+nome);
			System.out.println("X: "+pontox);
			System.out.println("Y: "+pontoy);
		}return 0;
	}
}