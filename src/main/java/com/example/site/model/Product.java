package com.example.site.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String soi;
	private String tip;
	private String culoare;
	private double pret;

	@Column(nullable = false)
	private int stoc;

	@OneToMany(mappedBy = "product")
	private List<OrderedProducts> quantities;
	
	public Product() {
		super();
	}
	
	public Product(String nume, String soi, String tip, String culoare, double pret, int stoc) {
		super();
		this.name = nume;
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

	public String getName() {
		return name;
	}

	public void setName(String nume) {
		this.name = nume;
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

	public List<OrderedProducts> getQuantities() {
		return quantities;
	}

	public void setQuantities(List<OrderedProducts> quantities) {
		this.quantities = quantities;
	}

	@Override
	public String toString() {
		return "Product [nume=" + name + ", soi=" + soi + ", tip=" + tip + ", culoare=" + culoare + ", pret=" + pret
				+ ", bucati pe stoc=" + stoc + "]";
	}

}
