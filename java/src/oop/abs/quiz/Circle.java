package oop.abs.quiz;

public class Circle extends Shape {
	int r;	
	
	public Circle(String name,int r) {
		super(name);
		this.r = r;		
	}
	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
	
}
