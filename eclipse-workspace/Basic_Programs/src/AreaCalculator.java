
public class AreaCalculator {
	public static void calculate(ShapeLike s) {
		System.out.println("Area of " + s.getName() + " is " + (s.getHeight() * s.getWidth()));
	}

	public static void main(String args[]) {
		Square square = new Square();
		AreaCalculator.calculate(square);
		AreaCalculator.calculate(new Maruti800());	
	}
}