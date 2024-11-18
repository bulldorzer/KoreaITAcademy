package exam04;

public class AnimalHospital {
	private static AnimalHospital instance = null;
	
	private AnimalHospital() {}
	
	public static AnimalHospital getInstance() {
		if (instance == null) {
			instance = new AnimalHospital();
		}
		return instance;
	}
}
