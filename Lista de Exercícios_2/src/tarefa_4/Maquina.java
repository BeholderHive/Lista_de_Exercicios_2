package tarefa_4;

import java.util.ArrayList;
import java.util.List;


public class Maquina {
	
	List<Base> operacoes=new ArrayList<>();
	
	public void adicionaOperacao(Base bs){
		operacoes.add(bs);
	}

	public int adicionarPontos(String operacao, int z, boolean val) {
		for(int i=0;i<operacoes.size();i++)
			if(operacoes.get(i).adicionarPontos(operacao, z, val)!=0)
				return operacoes.get(i).adicionarPontos(operacao, z, val);
		return 0;	
	}
	
	public int removerPontos(String operacao, int z, boolean val) {
		for(int i=0;i<operacoes.size();i++)
			if(operacoes.get(i).removerPontos(operacao, z, val)!=0)
				return operacoes.get(i).removerPontos(operacao, z, val);
		return 0;	
	}
	
	public int mostraFigura(String operacao) {
		for(int i=0;i<operacoes.size();i++)
			if(operacoes.get(i).mostraFigura(operacao)!=0)
				return operacoes.get(i).mostraFigura(operacao);
		return 0;	
	}
}
