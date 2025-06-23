package com.lti.entity;

public class Product {
	
	private int prdId;
	private String prdName;
	private double prdCost;
	
	public Product() {
		super();
	}

	public Product(int prdId, String prdName, double prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	
	
	public double printBill(int qty) {
		double billamount=qty*this.prdCost;
		return billamount;
		
	}
	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public double getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}

	@Override
	public String toString() {
		return " \n Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}
	
	
	

}
