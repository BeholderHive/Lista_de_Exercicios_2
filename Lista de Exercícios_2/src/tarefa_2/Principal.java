package tarefa_2;

public class Principal {
	/*2)Elabore uma classe que implemente uma calculadora. Essa classe implementar� todas as
		opera��es b�sicas. Ela ter� um atributo especial, o qual receber� uma instru��o dizendo que uma
		determinada opera��o n�o poder� ser realizada. Criar um m�todo para cada opera��o matem�tica, e
		bloquear a opera��o se a instru��o especial receber um char representando qualquer uma das
		opera��es. Ex: �+�, portanto a calculadora n�o far� a opera��o de adi��o, mesmo que voc� chame o
		m�todo somarDados.*/

	public static void main(String[] args) {
		
		Operacoes op1=new Soma(2,3);
		Operacoes op2=new Subtrair(9,5);
		Operacoes op3=new Multiplicar(5,5);
		Operacoes op4=new Dividir(10,5);
		Calculadora c=new Calculadora();
		op1.pegaTrava("+");
		c.adicionaOperacao(op1);
		c.adicionaOperacao(op2);
		c.adicionaOperacao(op3);
		c.adicionaOperacao(op4);
		/*Ao travar a conta, o resultado sempre voltar� "0"*/
		
		System.out.println(c.calculaResultado("+"));
		System.out.println(c.calculaResultado("-"));
		System.out.println(c.calculaResultado("x"));
		System.out.println(c.calculaResultado("/"));

	}

}
