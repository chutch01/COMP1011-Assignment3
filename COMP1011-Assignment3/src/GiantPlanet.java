/**
 * 
 */

/**
 * @author chutc_000
 *
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {
	//holds if its gas or ice
	private String _type;
	//constructor
	public GiantPlanet(String name, double diameter, double mass, String type, boolean ringCount, int moonCount ) {
		super(name, diameter, mass);
		this._type = type;
	}
//implement interface for hasMoons
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
//implement interface for hasRings
	@Override
	public boolean hasRings() {
		
		if(this._ringCount > 0){
			return true;
		}
		else{
		return false;
		}
	}

}
