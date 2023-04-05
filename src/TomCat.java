public class TomCat extends AvioaneLupta{
	
	public TomCat(String planeId, int totalEnginePower) {
		super (planeId, totalEnginePower);
	}
	
	public void refuel() {
		System.out.println(getPlaneId() + "Initiating refueling procedure - Locating refueller - Catching up Refueling - Refueling complete.");
	}
	
}