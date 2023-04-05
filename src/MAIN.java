import java.io.PrintStream;

public class MAIN {

	public static void main(String[] args) {
	
	Concorde avion1 = new Concorde (50, "Id1", 200);
	Boeing avion2 = new Boeing (50, "Id2", 400);
	TomCat avion3 = new TomCat ("Id3", 400);
	Mig avion4 = new Mig ("Id4", 400);
	Concorde avion5 = new Concorde (50, "Id5", 400);
	Boeing avion6 = new Boeing (50, "Id6", 400);
	TomCat avion7 = new TomCat ("Id7", 400);
	Mig avion8 = new Mig ("Id8", 400);
	
	
	avion1.fly();
	avion2.getTotalEnginePower();
	}
}
