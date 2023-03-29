package Interfaccia3Piastrella;

public class PiastrellaQuadrata extends Piastrella {
	private double lato;
	public PiastrellaQuadrata(double lato) {
		this.lato = lato;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = lato * lato;
		return area;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

}
