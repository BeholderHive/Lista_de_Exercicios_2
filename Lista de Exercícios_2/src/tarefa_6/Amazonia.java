package tarefa_6;

public class Amazonia {
	
	public void imprimirPinheiro (int tamanho) {
		 int linha,aux,c;
         aux = tamanho;
         for ( linha = 1 ; linha <= tamanho ; linha++ )
            {
               for ( c = 1 ; c < aux ; c++ )
                 System.out.print(" ");

               aux--;

               for ( c = 1 ; c <= 2*linha - 1 ; c++ )
                   System.out.print("*");

               System.out.println("");
            }
	}

}
