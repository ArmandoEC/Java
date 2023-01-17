package models.entities;

import models.enums.Color;

public class Circle extends Shape{
	private Double area;

	public Circle(Color color, Double area) {
		super(color);
		this.area = area;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public double area() {
		return 1;
	}
	
	
}
