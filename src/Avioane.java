
public class Avioane {

	private String planeId;
	private int totalEnginePower;
	
	public Avioane(String planeId, int totalEnginePower) {
		this.planeId = planeId;
		this.totalEnginePower = totalEnginePower;
	}

	public String getPlaneId() {
		return planeId;
	}
	
	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	public void takeOff() {
		System.out.println(getPlaneId() + "Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking Off - Retracting gear - TakeOff complete");
	}
	 
	public void land() {
		System.out.println(getPlaneId() + "Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
	}
	
	public void fly() {
		System.out.println(getPlaneId() + "Flying");
	}
	
	
}
