import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
	
		System.out.print("Podaj cyfrê:");
		
		Scanner odczyt = new Scanner(System.in);
		
		int liczba = odczyt.nextInt();
		int silnia=1, j=1;

		for(int i=1; i<=liczba; i++) {
			
			silnia = silnia*i;
			
		}
		
		System.out.print(silnia);
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

