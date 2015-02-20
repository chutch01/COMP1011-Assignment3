/**
 * 
 */

/**
 * @author chutc_000
 *
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {

	private String _type;
	public GiantPlanet(String name, double diameter, double mass, String type, boolean ringCount, int moonCount ) {
		super(name, diameter, mass);
		this._type = type;
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
	public boolean hasRings() {
		// TODO Auto-generated method stub
		if(this._ringCount > 0){
			return true;
		}
		else{
		return false;
		}
	}

}
