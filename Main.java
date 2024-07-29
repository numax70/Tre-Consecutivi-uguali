
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=Function.lunghezzaArray();
		int[] array = new int[len];
		Function.inserisciValoriArray(array);
		if(Function.confrontoValori(array)) {
			System.out.println("Tre valori consecutivi uguali");
		}else {
			System.out.println("NO");
		}

	}

}
