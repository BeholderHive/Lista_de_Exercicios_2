package tarefa_2;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	int a;
	int b;
	String lock;

	List<String> operacoes=new ArrayList<>();

	public String getLock() {
		return lock;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void adicionaOperacao(String op){
		operacoes.add(op);
	}

	public String setLock(String travas) {
		if(travas=="+") {
			lock = travas;
			return lock;}
		else if(travas=="-") {
			lock = travas;
			return lock;}
		else if(travas=="x") {
			lock = travas;
			return lock;}
		else if(travas=="/") {
			lock = travas;
			return lock;}
		return " ";
	}

	public int soma() {
		if("+" != lock)
			return a+b;
		return 0;
	}

	public int sub() {
		if("-" != lock)
			return a-b;
		return 0;
	}

	public int mult() {
		if("x" != lock)
			return a*b;
		return 0;
	}

	public int divd() {
		if("/" != lock)
			return a/b;
		return 0;
	}

}

