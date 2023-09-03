package lista1;

public class Questao15 {

	public static void main(String[] args) {
		
		int a = 1, b = 19;
		boolean v = true, f = false;
		
		
		if (a < 10 == v) {
				System.out.println("a < 10");
		}
		if (a + b == 20 == v){
			System.out.println("a + b == 20");	
		}
		if((a < 10 == v || a + b == 20 == v ) == f) {
			System.out.println("numeros invalidos");
		}

	}

}
