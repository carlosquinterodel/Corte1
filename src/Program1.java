
public class Program1 {

	public static void main(String[] args) {
		int numero = 97;
		boolean resp = numeroPrimo(numero, 3);
		System.out.println("El numero "+numero+" es primo: "+resp);
	}
	
	//Funcion numero primo
		public static boolean numeroPrimo (int x, int contador) {
			
			if (contador > x/2) {
				return true;
	
			}else {
				if (x % 2 ==0) {
					return false;
				}
				if(x % contador == 0) {
					return false;
				}else {
					return numeroPrimo(x, contador+2);
				}
			}
		}

}
