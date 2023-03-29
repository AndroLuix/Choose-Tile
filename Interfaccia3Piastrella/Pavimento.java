package Interfaccia3Piastrella;


public class Pavimento {
	
	private int numeroPiastrelle;
	
	public Pavimento(int numeroPiastrelle) {
		this.numeroPiastrelle = numeroPiastrelle;
	}
	
	
	public double getSuperficie(Piastrella tipo) {
		if( tipo instanceof PiastrellaQuadrata) {
			PiastrellaQuadrata p = (PiastrellaQuadrata) tipo;
			return p.getArea() * numeroPiastrelle;
			
		}else if(tipo instanceof PiastrellaTriangolo) {
			PiastrellaTriangolo p = (PiastrellaTriangolo) tipo;
			return p.getArea() * numeroPiastrelle;
		}
		return 42;
		
	}


	public int getNumeroPiastrelle() {
		return numeroPiastrelle;
	}


}
