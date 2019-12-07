package tarefa_2;

public class Principal {
	/*2)Elabore uma classe que implemente uma calculadora. Essa classe implementara todas as
		operaçoes basicas. Ela tera um atributo especial, o qual recebera uma instrucao dizendo que uma
		determinada operacao não podera ser realizada. Criar um metodo para cada operação matematica, e
		bloquear a operacao se a instrucao especial receber um char representando qualquer uma das
		operacoes. Ex: ‘+’, portanto a calculadora nao fará a operacao de adicao, mesmo que voce chame o
		metodo somarDados.*/

	public static void main(String[] args) {

		Calculadora c=new Calculadora();
		c.setA(10); c.setB(5);

		c.setLock("+");
		c.adicionaOperacao("+");
		c.adicionaOperacao("-");
		c.adicionaOperacao("x");
		c.adicionaOperacao("/");
		/*Ao travar a conta, o resultado sempre voltará "0"*/
		
		System.out.println(c.soma());
		System.out.println(c.sub());
		System.out.println(c.mult());
		System.out.println(c.divd());

	}

}
