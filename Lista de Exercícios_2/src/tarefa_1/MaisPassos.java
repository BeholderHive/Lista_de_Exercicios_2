package tarefa_1;

public class MaisPassos extends Operacoes{
	int a;
	
	public MaisPassos(int a) {
		this.a=a;
	}
	
	@Override
	public int addPassos(String operacao, int b) {
		if(operacao=="+") {
			if(a <= 12) {
				return a+b;}
			else {System.out.println("O número de passos foi excedido");}
		}return 0;
	}
	
}
