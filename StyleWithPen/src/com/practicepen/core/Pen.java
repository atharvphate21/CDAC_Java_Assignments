package com.practicepen.core;

import java.time.LocalDate;

public class Pen {
	
	private static int ID=1;
	private int id;
	private Brand brand;
	private String color;
	private InkColor inkColor;
	private Material material;
	private int stock;
	private LocalDate updateDate;
	private LocalDate listedDate;
	private int price;
	private double discount=0.0;
	
	
	
	public Pen(Brand brand, String color, InkColor inkColor, Material material, int stock, LocalDate updateDate,
			LocalDate listedDate, int price) {
		 
		this.id=ID++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.updateDate = updateDate;
		this.listedDate = listedDate;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Brand getBrand() {
		return brand;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public InkColor getInkColor() {
		return inkColor;
	}


	public void setInkColor(InkColor inkColor) {
		this.inkColor = inkColor;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public LocalDate getUpdateDate() {
		return updateDate;
	}


	public LocalDate setUpdateDate(LocalDate updateDate) {
		return this.updateDate = updateDate;
	}


	public LocalDate getListedDate() {
		return listedDate;
	}


	public void setListedDate(LocalDate listedDate) {
		this.listedDate = listedDate;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", updateDate=" + updateDate + ", listedDate=" + listedDate
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	


}
