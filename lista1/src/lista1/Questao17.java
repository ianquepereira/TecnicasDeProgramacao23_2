package lista1;

public class Questao17 {

	public static void main(String[] args) {

		int a = 10, b = 10;
		boolean f = false;
		
		if (a == 10 || a + b == 20) {
				System.out.println("numero valido");
		} else if (a == b){
			System.out.println("a == b");	
		}
		if(a + b != 10 && a < 10) {
			System.out.println("a < 10");
		}if(((a == 10 || a + b == 20)&&(a == b) &&(a + b != 10 && a < 10)) == f) {
				System.out.println("numero nao valido");
			}

		}
}
