package tarefa_1;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
	
	List<Operacao> operacao =new ArrayList<>();
	
	public void adicionaOperacao(Operacao op){
		operacao.add(op);
	}

	public int addPassos(String operacao, int b) {
		for(int i = 0; i< this.operacao.size(); i++)
			if(this.operacao.get(i).addPegadas(operacao, b)!=0)
				return this.operacao.get(i).addPegadas(operacao, b);
		return 0;	
	}
	
	public int showPegadas(String operacao) {
		for(int i = 0; i< this.operacao.size(); i++)
			if(this.operacao.get(i).showPegadas(operacao)!=0)
				return this.operacao.get(i).showPegadas(operacao);
		return 0;	
	}
	
	public int pessoa(String operacao) {
		for(int i = 0; i< this.operacao.size(); i++)
			if(this.operacao.get(i).pessoa(operacao)!=0)
				return this.operacao.get(i).pessoa(operacao);
		return 0;	
	}
}

