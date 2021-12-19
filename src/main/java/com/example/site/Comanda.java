package com.example.site;

public class Comanda {

	private int nrComanda;
	private Client client;
	
	public Comanda() {
		super();
	}
	
	public Comanda(int nrComanda, Client client) {
		super();
		this.nrComanda = nrComanda;
		this.client = client;
	}

	public int getNrComanda() {
		return nrComanda;
	}

	public void setNrComanda(int nrComanda) {
		this.nrComanda = nrComanda;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Comanda [nrComanda=" + nrComanda + ", client=" + client + "]";
	}
	
}
