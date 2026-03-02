package Abstractions;

class Plane {

	public void takeOff() {
		System.out.println("Plane is taking off.");
	}

	public void fly() {
		System.out.println("Plane is flying.");
	}

	public void land() {
		System.out.println("Plane is landing.");
	}

	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump");
	}
}

// Child class 1
class Cargo extends Plane {

	@Override
	public void takeOff() {
		System.out.println("Cargo plane needs long runway to take off.");
	}

	@Override
	public void fly() {
		System.out.println("Cargo plane is flying at lower heights.");
	}

	@Override
	public void land() {
		System.out.println("Cargo plane is landing with heavy load.");
	}

	public void carrycargo() {
		System.out.println("Cargo plane carries goods.");
	}
}

// Child class 2
class Passenger extends Plane {

	@Override
	public void takeOff() {
		System.out.println("Passenger plane is taking off smoothly.");
	}

	@Override
	public void fly() {
		System.out.println("Passenger plane is flying at medium height.");
	}

	@Override
	public void land() {
		System.out.println("Passenger plane is landing safely.");
	}

	public void carrypassenger() {
		System.out.println("Passenger plane carries people.");
	}
}

// Child class 3
class Jet extends Plane {

	@Override
	public void takeOff() {
		System.out.println("Jet takes off very fast.");
	}

	@Override
	public void fly() {
		System.out.println("Jet is flying at high altitude.");
	}

	@Override
	public void land() {
		System.out.println("Jet lands quickly.");
	}

	public void carryarms() {
		System.out.println("Jet carries weapons.");
	}
}

class Airport {

	public static void permit(Plane p) {
		System.out.println("Airport permission granted:");
		p.takeOff();
		p.fly();
		p.land();

		System.out.println();
	}
}

public class MyPlane {

	public static void main(String[] args) {

		Cargo c = new Cargo();
		Passenger p1 = new Passenger();
		Jet j = new Jet();

		Airport.permit(c);
		Airport.permit(p1);
		Airport.permit(j);
	}
}
