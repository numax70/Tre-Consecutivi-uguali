/*
 * Scrivere un programma TreConsecutivi che prevede un array di numeri interi contenente valori a 
  piacere e stampa "Tre valori consecutivi uguali" se l'array contiene tre valori uguali in tre posizioni consecutive, 
  oppure stampa "NO" altrimenti.
 * */
import java.util.Scanner;
public class Function {
	
	public static int lunghezzaArray() {
		Scanner input = new Scanner(System.in);
		
		int len = stringToInt();
		return len;
	}
	
	public static int stringToInt() {
		boolean check;
		int number=0;
		do {
			check=true;
			Scanner input =new Scanner(System.in);
			System.out.print("Inserisci lunghezza array: ");
			String s = input.nextLine();
			try {
				number = Integer.parseInt(s);
			}catch(Exception e) {
				check=false;
				System.out.println("Non hai inserito un intero!!");
			}
		}while(!check);
		return number;
	}
	
	public static void inserisciValoriArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print("Inserisci il " + (i+1) +" valore: ");
			Scanner input = new Scanner(System.in);
			a[i]=input.nextInt();
		}
	}
	
	public static boolean confrontoValori(int[] a) {
		boolean verifica=false;
		//int count=0;
		
		/*for(int i=0; i<a.length; i++) {
			for(int j=1; j<a.length; j++) {
				
				System.out.print("Valori di i: " + a[i] + " " + "indice di i: " + i);
				System.out.println("\n");
				System.out.println("Valori di j: " + a[j]+ " " + "indice di j: " + j);
				if(a[i]==a[j] && i-j==1) {
					count++;
					j++;
					
				}
				
			}
			
		}*/
		for(int i=0; i<a.length-2; i++) {
			if(a[i]==a[i+1] && a[i+1]==a[i+2]) {
				verifica= true;
			}
			
		}
		/*System.out.println("Valore count: " + count);
		if(count==2) {
			return false;
		}else {
			return true;
		}*/
		return verifica;
		
	}
}
