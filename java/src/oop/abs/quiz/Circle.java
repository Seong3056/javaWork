package oop.abs.quiz;

public class Circle extends Shape {
	int r;
	double c_area;
	double c_cir ;
	
	public Circle(String name) {
		super(name);
	}
	
	public Circle(String name,int r) {
		super(name);
		this.r = r;		
	}
	@Override
	double getArea() {
		return Math.PI * r * r;
	}
	
}
