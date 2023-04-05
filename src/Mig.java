public class Mig extends AvioaneLupta{
	
	public Mig(String planeId, int totalEnginePower) {
		super (planeId, totalEnginePower);
	}
	
	public void hughSpeedGeometry() {
		System.out.println(getPlaneId() + "High speed geometry selected");
	}
	
	public void normalGeometry() {
		System.out.println(getPlaneId() + "Normal geometry selected");
	}

}

