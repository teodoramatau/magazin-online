package com.example.site;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	String nume; 
	String soi; 
	String tip;
	String culoare; 
	double pret;
	int stoc;
	
	public Product() {
		super();
	}
	
	public Product(String nume, String soi, String tip, String culoare, double pret, int stoc) {
		super();
		this.nume = nume;
		this.soi= soi;
		this.tip = tip;
		this.culoare = culoare;
		this.pret = pret;
		this.stoc = stoc;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public int getStoc() {
		return stoc;
	}

	public void setStoc(int stoc) {
		this.stoc = stoc;
	}

	@Override
	public String toString() {
		return "Product [nume=" + nume + ", soi=" + soi + ", tip=" + tip + ", culoare=" + culoare + ", pret=" + pret
				+ ", bucati pe stoc=" + stoc + "]";
	}

}
