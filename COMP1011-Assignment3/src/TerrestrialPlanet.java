/**
 * 
 */

/**
 * @author chutc_000
 *
 */
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	//stored a true or false variable for oxygen
	private boolean _oxygen;
	//constructor for the Terrestrial Planet
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen, int moonCount) {
		super(name, diameter, mass);
		this._oxygen = oxygen;
		// TODO Auto-generated constructor stub
	}
//hasMoons interface implementation
	@Override
	public boolean hasMoons() {
		// TODO Auto-generated method stub
		if(this._moonCount > 0){
			return true;
		}
		else{
		return false;
		}
	}
//habitable interface implementation
	@Override
	public boolean habitable() {
		// TODO Auto-generated method stub
		if(this._oxygen == true){
			return true;
		}
		else{
		return false;
		}
	}

}
