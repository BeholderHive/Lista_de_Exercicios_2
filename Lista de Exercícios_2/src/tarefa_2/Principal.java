package tarefa_2;

public class Principal {
	/*2)Elabore uma classe que implemente uma calculadora. Essa classe implementará todas as
		operações básicas. Ela terá um atributo especial, o qual receberá uma instrução dizendo que uma
		determinada operação não poderá ser realizada. Criar um método para cada operação matemática, e
		bloquear a operação se a instrução especial receber um char representando qualquer uma das
		operações. Ex: ‘+’, portanto a calculadora não fará a operação de adição, mesmo que você chame o
		método somarDados.*/

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
		/*Ao travar a conta, o resultado sempre voltará "0"*/
		
		System.out.println(c.calculaResultado("+"));
		System.out.println(c.calculaResultado("-"));
		System.out.println(c.calculaResultado("x"));
		System.out.println(c.calculaResultado("/"));

	}

}
