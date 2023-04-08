package Application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {
				"Hamilton ", "Fabiana ", "Lethycia"
		};
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		// Laço for each ↓
		System.out.println("________________");
		for (String itensVetor : vect) {
			System.out.println(itensVetor);
		}
	}

}
