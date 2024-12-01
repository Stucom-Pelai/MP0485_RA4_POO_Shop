package model;

import java.util.Arrays;

public class Sale {
	String client;
	Product[] products;
	double amount;

	public Sale(String client, Product[] products, double amount) {
		super();
		this.client = client;
		this.products = products;
		this.amount = amount;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sale [client=" + client + ", products=" + Arrays.toString(products) + ", amount=" + amount + "]";
	}

}
