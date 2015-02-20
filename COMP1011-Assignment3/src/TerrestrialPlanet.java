/**
 * 
 */

/**
 * @author chutc_000
 *
 */
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	
	private boolean _oxygen;
	
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen, int moonCount) {
		super(name, diameter, mass);
		this._oxygen = oxygen;
		// TODO Auto-generated constructor stub
	}

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
