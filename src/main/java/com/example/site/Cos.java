package com.example.site;

import java.util.ArrayList;

public class Cos {

	private ArrayList<Product> products = new ArrayList<Product>();
	private double pretTotal;
	
	public Cos() {
		super();
	}
	
	public Cos(ArrayList<Product> products, double pretTotal) {
		super();
		this.products = products;
		this.pretTotal = pretTotal;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public double getPretTotal() {
		return pretTotal;
	}

	public void setPretTotal(double pretTotal) {
		this.pretTotal = pretTotal;
	}

	@Override
	public String toString() {
		return "CosCumparaturi [products=" + products + ", pretTotal=" + pretTotal + "]";
	}
	
}
