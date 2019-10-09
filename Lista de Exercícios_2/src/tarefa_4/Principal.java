package tarefa_4;

public class Principal {

	public static void main(String[] args) {
		/*4)Elaborar uma classe para guardar os pontos de uma figura genérica. Usar List e 
		    ArrayList, e um método adicionarPontos(int x, int y), e removerPontos(int x, int y). */

		FiguraGenerica fg= new FiguraGenerica();
		Base bs = new MudaPontos(0,0);
		Maquina mq = new Maquina();
		mq.adicionaOperacao(bs);
		
		fg.nome = "Lugar Distante";
		//Na hora do boolean --> true(retorna x), false(retorna y)
		fg.pontox += mq.adicionarPontos("+", 20, false);
		fg.pontoy += mq.adicionarPontos("+", 10, true);
		fg.pontox += mq.removerPontos("-", 5, false);
		fg.pontoy += mq.removerPontos("-", 2, true);
		
		fg.mostraFigura("!");
	}

}
