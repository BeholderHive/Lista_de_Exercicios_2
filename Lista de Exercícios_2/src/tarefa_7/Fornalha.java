package tarefa_7;

public class Fornalha {
	int x, y, raio;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public void Circule () {
		for (int i = 0;i <= x + raio; i++) {
	        for (int j = 1;j <=y + raio; j++) {
	             int xQuadrado = (i - x)*(i - x);
	             int yQuadrado = (j - y)*(j - y);
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
