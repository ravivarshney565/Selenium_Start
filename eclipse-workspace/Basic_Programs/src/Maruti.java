class Maruti extends Car {
	public Maruti() {
		System.out.println("Class Maruti");
	}

	public void brand() {
		System.out.println("Brand: Maruti");
	}

	public void speed() {
		System.out.println("Faster than base model, which has ");
		super.speed();
		System.out.println("Max: 90Kmph");
	}
	
	public void vehicleType() {
		System.out.println("Ravi Vehicle Type: Car");
	}
}