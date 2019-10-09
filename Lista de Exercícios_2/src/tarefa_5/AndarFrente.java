package tarefa_5;

public class AndarFrente extends Personagem{
    public void AndarParaFrente() {
    	System.out.println(caminho);
    	char first = caminho.charAt(caminho.length()-1);
    	caminho = first+caminho.substring(0,caminho.length()-1);
    }   
}
