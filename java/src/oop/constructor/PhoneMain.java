package oop.constructor;

class PhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.showSpec();

		System.out.println("-------------------");
		
		Phone galaxy23 = new Phone("galaxy23");		
		galaxy23.showSpec();
	
		System.out.println("-------------------");
		
		Phone iPhone14 = new Phone("아이폰 14","스페이스 그레이");		
		iPhone14.showSpec();
	}

}
