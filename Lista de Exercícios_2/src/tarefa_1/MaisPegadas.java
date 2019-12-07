package tarefa_1;

public class MaisPegadas extends Operacao {
	int a;
	
	public MaisPegadas(int a) {
		this.a=a;
	}
	
	@Override
	public int addPegadas(String operacao, int b) {
		if(operacao=="+") {
			if(a <= 12) {
				return a+b;}
			else {System.out.println("O número de passos foi excedido");}
		}return 0;
	}
	
}
