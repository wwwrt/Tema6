public class AvioaneLupta extends Avioane {

	public AvioaneLupta (String planeId, int totalEnginePower) {
		super (planeId, totalEnginePower);
	}

	public void launchMissile() {
		System.out.println(getPlaneId() + "Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete.");
	}
	
	
}
