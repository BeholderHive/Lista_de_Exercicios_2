package tarefa_4;

public class MudaPontos extends Base{
	int a,b;
	
	public MudaPontos(int x, int y) {
		this.a=x; this.b=y;
	}
	
	@Override
	public int adicionarPontos(String operacao, int z, boolean val) {
		if(operacao=="+") {
			if(val == true) {
				return a+z;}
			else {return b+z;}
		}return 0;
	}
	
	public int removerPontos(String operacao, int z, boolean val) {
		if(operacao=="-") {
			if(val == true) {
				return a-z;}
			else {return b-z;}
		}return 0;
	}
	
}
