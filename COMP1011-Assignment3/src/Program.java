/**
 * 
 */

/**
 * @author chutc_000
 *
 */
public class Program {

	/**
	 * @param args
	 */
	//main method
	public static void main(String[] args) {
		
		GiantPlanet jupitor = new GiantPlanet("jupitor", 45, 2, "gas", true, 3);
		//run and print out tostring method as well if it has moons or rings
		jupitor.hasMoons();
		jupitor.hasRings();
		System.out.println(jupitor.toString());
		System.out.println("Moons: " + jupitor.hasMoons());
		System.out.println("Rings: " + jupitor.hasRings());
		
		TerrestrialPlanet kepler = new TerrestrialPlanet("kepler", 30000, 45000, true, 3);
		
		//run and print out to string and if it has moons and is habitable
		kepler.habitable();
		kepler.hasMoons();
		System.out.println(kepler.toString());
		System.out.println("Moons: " + kepler.hasMoons());
		System.out.println("Oxygen: " + kepler.habitable());
		
		

	}

}
