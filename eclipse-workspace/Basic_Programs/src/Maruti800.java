
public class Maruti800 extends Maruti implements ShapeLike {

	public Maruti800() {
		System.out.println("Maruti Model: 800");
	}

	
	public static void main(String args[]) {
		Maruti800 obj = new Maruti800();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	
	}

    public Integer getHeight() {
    	return 6; 	
    }
    
    public Integer getWidth() {
    	return 10;
    }
    
    public String getName() {
    	return "Maruti 800";
    }
}

