/**
 * Fig. 18.5: CalculadoraFibonacci.java
 * Método fibonacci iterativo
 */
public class Fibon {
	
	public int fibonIterativo(int n) {
		if(n <= 1) {
			return n;
		}
		int fibo = 1;
		int preFibo = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fibo;
			fibo+= preFibo;
			preFibo = temp;
		}
		return fibo;
	}
