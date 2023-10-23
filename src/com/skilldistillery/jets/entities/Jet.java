package com.skilldistillery.jets.entities;

public abstract class Jet {
	protected String name;
	private String model;
	protected double speed;
	protected int range;
	private long price;
	

	public Jet(String name, String model, double speed, int range, long price) {
		this.name = name;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public abstract void fly();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [name=" + name + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

	
	

}
