package tarefa_1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		/*1)Elabore uma classe que represente uma pessoa, com todos os seus atributos. Um dos atributos
		devera ser passosCaminhados, o qual guardara o número de passos que a pessoa deu em um dia.
		Você devera criar um metodo para incrementar o numero de passos. Se a pessoa ultrapassar 12
		passos, o programa automaticamente devera exibir uma mensagem falando que o numero de passos
		foi excedido, e que mesmo que o metodo seja invocado, o numero de passos nao sera incrementado.
		Criar os getters e setters. Criar um metodo para mostrar todos os dados da pessoa. Criar um metodo
		para mostrar os passos.*/
		Scanner input = new Scanner(System.in);
		boolean loop=true;
		Pessoa p=new Pessoa();
		
		Operacao op=new MaisPegadas(0);
		Maquina mq=new Maquina();
		mq.adicionaOperacao(op);
		
		System.out.println("Informe o seu nome: ");
		p.setNome(input.next());
		
		while(loop) {
			
			System.out.print("Informe o numero de passos que deseja andar: \n");
			p.setPegadas(p.getPegadas() + mq.addPassos("+", input.nextInt()));

			System.out.print("Deseja andar mais um pouco? (s=0/n=1): \n");
			if ((input.nextInt())==1){loop = true;}
			else {loop=false;}
			
			if(p.getPegadas() > 12) {
				System.out.println("O numero de passos foi excedido");
				loop = false;
			}
		}
		
		input.close();
		
		p.pessoa("!");
		
		p.showPegadas("=");
	}

}
