package tarefa_7;

public class Fornalha {
	public void Circule (int raio, int X, int Y) {
		for (int i = 0;i <= X + raio; i++) {
	        for (int j = 1;j <=Y + raio; j++) {
	             int xQuadrado = (i - X)*(i - X);
	             int yQuadrado = (j - Y)*(j - Y);
	             if (Math.abs(xQuadrado + yQuadrado - raio * raio) < raio) {
	                 System.out.print("*");
	             } else {
	                 System.out.print(" ");
	             }
	         }
	         System.out.println();
	     }
	}
}
