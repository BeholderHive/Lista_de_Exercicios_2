package tarefa_2;

public class Multiplicar extends Operacoes{
	int a;
	int b;
	String travasLocal;
	
	public Multiplicar(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public String pegaTrava(String travas) {
		if(travas=="x") {
			travasLocal = travas;
			return travasLocal;}
		return " ";
	}
	
	@Override
	public int calculaResultado(String operacao) {
		if(operacao=="x" && operacao!=travasLocal)
			return a*b;
		return 0;
	}

}