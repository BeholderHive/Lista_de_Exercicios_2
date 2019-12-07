package tarefa_3;

public class RemoverSobrenome {
	private String[] sobreNome;
	private String[] nome;

	public String[] getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String[] nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	private String[] nomeCompleto;

	public String[] getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String[] sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public String[] RemoveSobrenome(String[] listaAlunos, int part) {
		String[] a={"","","","","","","","","",""}, b={"","","","","","","","","",""};
		for(int j=0; j < listaAlunos.length; j++) {
			String[] array = listaAlunos[j].split(" ");
		    String firstPart = array[0];
		    String lastPart = array[array.length-1];
		    for (int i = 1; i < array.length - 1; i++) {
		        firstPart += " " + array[i]; 
		    }
		    a[j] = firstPart;
		    b[j] = lastPart;
		}
		if (part <= 1) {return a;}
		else {return b;}
	}
}
