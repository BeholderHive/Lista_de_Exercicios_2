package tarefa_1;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
	
	List<Operacoes> operacoes=new ArrayList<>();
	
	public void adicionaOperacao(Operacoes op){
		operacoes.add(op);
	}

	public int addPassos(String operacao, int b) {
		for(int i=0;i<operacoes.size();i++)
			if(operacoes.get(i).addPassos(operacao, b)!=0)
				return operacoes.get(i).addPassos(operacao, b);
		return 0;	
	}
	
	public int mostraPassos(String operacao) {
		for(int i=0;i<operacoes.size();i++)
			if(operacoes.get(i).mostraPassos(operacao)!=0)
				return operacoes.get(i).mostraPassos(operacao);
		return 0;	
	}
	
	public int mostraPessoa(String operacao) {
		for(int i=0;i<operacoes.size();i++)
			if(operacoes.get(i).mostraPessoa(operacao)!=0)
				return operacoes.get(i).mostraPessoa(operacao);
		return 0;	
	}
}

