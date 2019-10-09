package tarefa_3;

public class RemoverSobrenome {
	String[] sobreNome= {"","","","","","","","","",""}, nome= {"","","","","","","","","",""};
	
	public String[] RemoveSobrenome(String[] listaAlunos, int part) {
		for(int j=0; j < listaAlunos.length; j++) {
			String[] array = listaAlunos[j].split(" ");
		    String firstPart = array[0];
		    String lastPart = array[array.length-1];
		    for (int i = 1; i < array.length - 1; i++) {
		        firstPart += " " + array[i]; 
		    }
		    nome[j] = firstPart;
		    sobreNome[j] = lastPart;
		}
		if (part <= 1) {return nome;}
		else {return sobreNome;}
	}
}
