package tarefa_2;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	List<Operacoes> operacoes=new ArrayList<>();
	
	public void adicionaOperacao(Operacoes op){
		operacoes.add(op);
	}

	public int calculaResultado(String operacao) {
		for(int i=0;i<operacoes.size();i++) {
			if(operacoes.get(i).calculaResultado(operacao)!=0)
				return operacoes.get(i).calculaResultado(operacao);
		}return 0;	
	}
}

