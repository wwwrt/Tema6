
public class AvioaneCalatori extends Avioane {
	private int maxPassengers;
	
	public AvioaneCalatori (int maxPassengers, String planeId, int totalEnginePower) {
		super(planeId, totalEnginePower);
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
}

