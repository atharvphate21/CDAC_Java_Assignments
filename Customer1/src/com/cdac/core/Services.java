package com.cdac.core;

public enum Services {

	
	SILVER(2000),GOLD(3000),PLATINUM(5000);
	double plan;
	private Services(double plan)
	{
		this.plan=plan;
	}
	
	
	public double getPlan() {
		return plan;
	}

	@Override
	public String toString() {
		return name()+" "+plan;
	}
}
