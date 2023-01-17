package models.entities;

import models.enums.Color;

public class Rectangle extends AbstractShape{
	private Double area;

	public Rectangle(Color color, Double area) {
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
		return 2;
	}
}
