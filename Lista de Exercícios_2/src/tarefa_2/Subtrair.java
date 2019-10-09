package tarefa_2;

public class Subtrair extends Operacoes{
	int a;
	int b;
	String travasLocal;
	public Subtrair(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public String pegaTrava(String travas) {
		if(travas=="-") {
			travasLocal = travas;
			return travasLocal;}
		return " ";
	}
	
	@Override
	public int calculaResultado(String operacao) {
		if(operacao=="-" && operacao!=travasLocal)
			return a-b;
		return 0;
	}

}
