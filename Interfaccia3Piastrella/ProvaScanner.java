package Interfaccia3Piastrella;
import java.util.Scanner;
public class ProvaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String scelta = "Hello Word!";
		
		while(!scelta.equals(null)) {
			System.out.println("Scegli se vuoi una piastrella quadrata[Q] o triangolare [T]");
			 scelta = scanner.nextLine();
		if(scelta.equalsIgnoreCase("T") || scelta.equalsIgnoreCase("Traingolo")) {
			System.out.println("inserisci il valore della base del triangolo");
			double base = scanner.nextDouble();
			System.out.println("inserisci il valore del lato obliquo del triangolo");
			double lato= scanner.nextDouble();
			PiastrellaTriangolo piastrella = new PiastrellaTriangolo(base, lato);
			System.out.println("l'area della piastrella triangolare e': "+piastrella.getArea());
			System.out.println("inserisci il numero di piastrelle");
			int numeroPiastrelle = scanner.nextInt();
			Pavimento pavimento = new Pavimento(numeroPiastrelle);
			System.out.println("La superficie copera e' "+pavimento.getSuperficie(piastrella));
			return;
			
		}else if(scelta.equalsIgnoreCase("Q") || scelta.equalsIgnoreCase("Quadrato")) {
			System.out.println("inserisci il valore del lato del quadrato");
			double lato = scanner.nextDouble();
			PiastrellaQuadrata piastrella = new PiastrellaQuadrata(lato);
			System.out.println("l'area della piastrella quadrata e': "+piastrella.getArea());
			System.out.println("inserisci il numero di piastrelle");
			int numeroPiastrelle = scanner.nextInt();
			Pavimento pavimento = new Pavimento(numeroPiastrelle);
			System.out.println("La superficie copera e' "+pavimento.getSuperficie(piastrella));
			return;
				
		}else {
			System.out.println("Non hai scelto acuna figura!");
		}
		}
	}

}
