package Constructors;

class Bike {
	String name;
	double mileage;
	int model;

	public Bike(String name) {
		this();
		this.name = name;
		System.out.println("inside name constructor...");
	}

	public Bike(double mileage) {

		this.mileage = mileage;
		System.out.println("inside mileage constructor...");
	}

	public Bike() {
		this(2025);
		System.out.println("inside default constructor...");
	}

	public Bike(int model) {
		this(30.0);
		this.model = model;

		System.out.println("inside model constructor...");
	}

	String getName() {
		return name;

	}

	double getMileage() {
		return mileage;

	}

	int getModel() {
		return model;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public void setModel(int model) {
		this.model = model;
	}

}

public class ServicePoint {

	public static void main(String[] args) {

		Bike b = new Bike("bullet");
		b.setName("maruti");
		System.out.println(b.getMileage());
		System.out.println(b.getModel());
		System.out.println("bike is:" + b.getName());
	}

}
