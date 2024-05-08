package com.practicepen.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.practicepen.core.Brand;
import com.practicepen.core.InkColor;
import com.practicepen.core.Material;
import com.practicepen.core.Pen;

public class PenServicesImpl implements PenService{

	
	Scanner sc= new Scanner(System.in);
	ArrayList<Pen> pen= new ArrayList<>();
	Pen p1= new Pen(Brand.CELLO, "Pink", InkColor.BLACK, Material.ALLOY_STEEL, 25, LocalDate.parse("2023-02-12"), LocalDate.parse("2023-03-15"), 25);
	Pen p2= new Pen(Brand.PARKER, "Yellow", InkColor.RED, Material.METAL, 25, LocalDate.parse("2023-01-21"), LocalDate.parse("2023-01-21"), 55);
	Pen p3= new Pen(Brand.REYNOLDS, "Green", InkColor.BLUE, Material.PLASTIC, 25, LocalDate.parse("2024-02-12"), LocalDate.parse("2024-03-12"), 45);
	Pen p4= new Pen(Brand.CELLO, "Orange", InkColor.RED, Material.METAL, 25, LocalDate.parse("2023-06-12"), LocalDate.parse("2023-07-15"), 35);
	
	
	int id;
	String brand;
	String color;
	String inkColor;
	String material;
	int stock;
	LocalDate updateDate;
	LocalDate listedDate;
	int price;
	boolean found= false;
	
	
	public PenServicesImpl() {
		pen.add(p1);
		pen.add(p2);
		pen.add(p3);
		pen.add(p4);
	}
	@Override
	public void addPen() {
		System.out.println("Enter Brand:");
		brand= sc.next();
//		Brand.valueOf(brand);
		System.out.println("Enter Color:");
		color= sc.next();
		System.out.println("Enter InkColor:");
		inkColor= sc.next();
//		InkColor.valueOf(inkColor);
		System.out.println("Enter Material:");
		material= sc.next();
//		Material.valueOf(material)
		System.out.println("Enter Stock");
		stock = sc.nextInt();
		System.out.println("Enter Price :");
		price= sc.nextInt();
		
		Pen newpen = new Pen(Brand.valueOf(brand), color, InkColor.valueOf(inkColor), Material.valueOf(material), stock, LocalDate.now(), LocalDate.now(), price)	;	
		pen.add(newpen);
		System.out.println("Pen Added Successfully");
	}

	@Override
	public void updatePen() {
		
		boolean found=false;
		System.out.println("Enter id to update pen:");
		id=sc.nextInt();
		for (Pen pen2 : pen) {
			if(pen2.getId()==id) {
				System.out.println("Enter updated stock:");
				stock=sc.nextInt();
				pen2.setStock(stock);
				pen2.setUpdateDate(LocalDate.now());
				System.out.println("Employee details Updated successfully!!");
				System.out.println(pen2);
				found=true;
			}
			
			
			
		}
		if(!found) {
			System.err.println("Pen with this id not present");
		}
		
	}

	@Override
	public void discount() {
		for (Pen pen2 : pen) {
//			if((pen2.getUpdateDate().getMonth()-LocalDate.now().getMonth())>=3){
			if ((pen2.getUpdateDate().minus(LocalDate.now()))>=3) {
				
			}
		}
		
	}

	@Override
	public void removePen() {
		
		
	}

	@Override
	public void displayPens() {
		for (Pen pen2 : pen) {
			System.out.println(pen2);
		}
	}

}
