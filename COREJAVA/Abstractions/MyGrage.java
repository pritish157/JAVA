package Abstractions;

abstract class Bike {
	public abstract void ignite();

	public abstract void changeGear();

	public abstract void accelerate();

	public abstract void applyBrake();

}

abstract class SuperBike extends Bike {

}

class Hayabuzza extends SuperBike {

	@Override
	public void ignite() {

		System.out.println("hz ignites.");

	}

	@Override
	public void changeGear() {
		System.out.println("hz change gears.");

	}

	@Override
	public void accelerate() {
		System.out.println("hz accelerates.");

	}

	@Override
	public void applyBrake() {

		System.out.println("hz appybrake.");

	}

}

class Hayabuzza2 extends Hayabuzza {
	@Override
	public void applyBrake() {

		System.out.println("hz2  appybrake.");

	}

	@Override
	public void accelerate() {
		System.out.println("hz2 accelerates.");

	}
}

public class MyGrage {
	public static void main(String[] args) {
		Bike hb = new Hayabuzza();
		hb.ignite();
		hb.changeGear();
		hb.accelerate();
		hb.applyBrake();
		System.out.println();
		hb = new Hayabuzza2();
		hb.applyBrake();
		hb.accelerate();

	}
}
