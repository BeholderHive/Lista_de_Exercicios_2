package tarefa_1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		/*1)Elabore uma classe que represente uma pessoa, com todos os seus atributos. Um dos atributos
		dever� ser passosCaminhados, o qual guardar� o n�mero de passos que a pessoa deu em um dia.
		Voc� dever� criar um m�todo para incrementar o n�mero de passos. Se a pessoa ultrapassar 12
		passos, o programa automaticamente dever� exibir uma mensagem falando que o n�mero de passos
		foi excedido, e que mesmo que o m�todo seja invocado, o n�mero de passos n�o ser� incrementado.
		Criar os getters e setters. Criar um m�todo para mostrar todos os dados da pessoa. Criar um m�todo
		para mostrar os passos.*/
		Scanner input = new Scanner(System.in);
		int continuar=0;
		Pessoa p=new Pessoa();
		
		Operacoes op=new MaisPassos(0);
		Maquina mq=new Maquina();
		mq.adicionaOperacao(op);
		
		System.out.println("Informe o seu nome: ");
		p.nome = input.next();
		
		while(continuar < 1) {
			continuar = 0;
			
			System.out.print("Informe o numero de passos que deseja andar: \n");
			p.passosCaminhados += mq.addPassos("+", input.nextInt());
			
			System.out.print("Deseja andar mais um pouco? (s=0/n=1): \n");
			continuar= input.nextInt();
			
			if(p.passosCaminhados > 12) {
				System.out.println("O n�mero de passos foi excedido");
				continuar = 2;
			}
		}
		
		input.close();
		
		p.mostraPessoa("!");
		
		p.mostraPassos("=");
	}

}
