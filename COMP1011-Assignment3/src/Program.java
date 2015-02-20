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
	public static void main(String[] args) {
		
		GiantPlanet jupitor = new GiantPlanet("jupitor", 45, 2, "gas", true, 3);
		
		jupitor.hasMoons();
		jupitor.hasRings();
		System.out.println(jupitor.toString());
		System.out.println("Moons: " + jupitor.hasMoons());
		System.out.println("Rings: " + jupitor.hasRings());
		
		TerrestrialPlanet kepler = new TerrestrialPlanet("kepler", 30000, 45000, true, 3);
		
		
		kepler.habitable();
		kepler.hasMoons();
		System.out.println(kepler.toString());
		System.out.println("Moons: " + kepler.hasMoons());
		System.out.println("Oxygen: " + kepler.habitable());
		
		

	}

}
