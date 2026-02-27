package Inheritance;

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
}

// Child class 1
class Cargo extends Plane {

	@Override
	public void fly() {
		System.out.println("Cargo plane is flying at lower heights..");
	}

	public void carrycargo() {
		System.out.println("cp carries cargo...");

	}
}

// Child class 2
class Passenger extends Plane {

	@Override
	public void fly() {
		System.out.println("Passenger plane if flying at a medium height...");
	}

	public void carrypassenger() {
		System.out.println("carries passenger.");
	}
}

// Child class 3
class Jet extends Plane {

	@Override
	public void fly() {
		System.out.println("Jet is flying  at higher level...");
	}

	public void carryarms() {
		System.out.println("carries arms..");

	}
}

class Airport {
	public static void permit(Plane q) {

		System.out.println("Airport is allowing....");
		q.takeOff();
		q.fly();
		q.land();
		System.out.println();
	}
}

public class MyAirport {

	public static void main(String[] args) {
		// loose coupling
		Cargo c = new Cargo();
		Jet j = new Jet();
		Passenger p = new Passenger();
		Airport.permit(c);
		Airport.permit(j);
		Airport.permit(p);

//		q = c;
//		q.fly();
//		((Cargo) q).carrycargo();

//		q = p;
//		q.fly();
//		((Passenger) q).carrypassenger();

//		q = j;
//		q.fly();
//        System.out.println("Cargo Plane:");
//        c.takeOff();
//        c.fly();
//        c.land();
//        c.carrycargo();
//
//        System.out.println("\nPassenger Plane:");
//        p.takeOff();
//        p.fly();
//        p.land();
//        p.carrypassenger();
//
//        System.out.println("\nJet:");
//        j.takeOff();
//        j.fly();
//        j.land();
//        j.carryarms();
	}
}
