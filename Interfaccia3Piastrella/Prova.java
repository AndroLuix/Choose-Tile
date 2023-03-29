package Interfaccia3Piastrella;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PiastrellaQuadrata pq = new PiastrellaQuadrata(10);
		  System.out.println(pq.getArea());
		  PiastrellaTriangolo pt = new PiastrellaTriangolo(30,10);
		  System.out.println(pt.getArea());
		  
		  Pavimentomio pav = new Pavimentomio(12, pq);
		  System.out.println("Pavimento con piastrelle quadrate "+pav.getSuperficie());
		  
		  Pavimento pav1 = new Pavimento(12);
		  System.out.println("Pavimento con piastrelle quadrate "+pav1.getSuperficie(pq));
		  System.out.println("Pavimento con piastrelle triangolari "+pav1.getSuperficie(pt));
		  
		  
		  Pavimento[] pavimenti ={
			  new Pavimento(200),
			  new Pavimento(400),
			  new Pavimento(150),
			  new Pavimento(200),
		  };
		 
		 System.out.println("");
		 
		  for(int i = 0; i < pavimenti.length; i++) {
			  System.out.println("Superficie "+i+ " con piastrele quadrate " + 
					  			pavimenti[i].getSuperficie(pq) +"\n numero piastrelle "+ pavimenti[i].getNumeroPiastrelle());
			  System.out.println("");
			  System.out.println("Superficie "+i+ " con piastrele triangolari " +
					  			pavimenti[i].getSuperficie(pt)+"\n numero piastrelle "+ pavimenti[i].getNumeroPiastrelle());
			  System.out.println("");

		  }

	}

}
