package Interfaccia3Piastrella;

public class PiastrellaTriangolo extends Piastrella {
	private double lato;
	private double base; 
	public PiastrellaTriangolo(double base, double latoObliquo) {
		lato = latoObliquo;
		this.base= base;
	}
	@Override
	public double getArea() {
		double area = (lato * base) / 2;
		return area;
	}
	public double getLato() {
		return lato;
	}
	public void setLato(double lato) {
		this.lato = lato;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
}
