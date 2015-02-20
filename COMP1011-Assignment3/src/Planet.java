
public abstract class Planet {
	//private variables
	protected double _diameter;
	protected double _mass;
	protected int _moonCount;
	protected String _name;
	protected double _orbitalPeriod;
	protected int _ringCount;
	protected double _rotationPeriod;
	
	//public properties++++++++++++++++++++++++++++++++++++
	//gets the diameter of the planet
	public double getDiameter() {
		return _diameter;
	}
	//gets mass of the planet
	public double getMass() {
		return _mass;
	}
	//gets number of moons
	public int getMoonCount() {
		return _moonCount;
	}
	//sets number of moons
	public void setMoonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	//gets the name of planets
	public String getName() {
		return _name;
	}
	//gets the orbital period of the planet
	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}
	//sets the orbital period for the planets
	public void setOrbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}
	//gets the number of rings the planet has
	public int getRingCount() {
		return _ringCount;
	}
	//sets the number of rings the planet has
	public void setRingCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	//gets the rotation period for the planet
	public double getRotationPeriod() {
		return _rotationPeriod;
	}
	//sets the rotation period of the planet
	public void setRotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}
	
	//constructor
	public Planet (String name, double diameter, double mass){
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
		
	}
	//overriding toString method to print the name, diameter and mass to
	//the console
	@Override
	public String toString(){
		
		return "Name:"  + this._name + " Diameter:" + this._diameter + " Mass:" + this._mass;
	
		//return "test";
	}
	
}

