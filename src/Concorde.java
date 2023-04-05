public class Concorde extends AvioaneCalatori {

	
	public Concorde(int maxPassengers, String planeId, int totalEnginePower) {
		super(maxPassengers, planeId, totalEnginePower);
		}




	public void goSuperSonic() {
		System.out.println(getPlaneId() + "Supersonic mode activated");
	}
	
	
	public void goSubSonic() {
		System.out.println(getPlaneId() + "Supersonic mode deactivated");
	}
	
}
