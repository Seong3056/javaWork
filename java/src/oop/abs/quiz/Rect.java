package oop.abs.quiz;

public class Rect extends Shape {

	int s_area;
	int x;
	private Rect(String name) {
		super(name);
	}
	public Rect(String name,int x) {
		super(name);
		this.x = x;
	}
	@Override
	public	double getArea() {
		return x * x;
	}
}
