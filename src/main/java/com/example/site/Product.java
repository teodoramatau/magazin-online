package com.example.site;

public class Product {

	String nume, soi, tip, culoare; 
	double pret;
	
	public Product(String nume, String soi, String tip, String culoare, double pret) {
		this.nume = nume;
		this.soi= soi;
		this.tip = tip;
		this.culoare = culoare;
		this.pret = pret;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getSoi() {
		return soi;
	}

	public void setSoi(String soi) {
		this.soi = soi;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Product [nume=" + nume + ", soi=" + soi + ", tip=" + tip + ", culoare=" + culoare + ", pret=" + pret
				+ "]";
	}

}
