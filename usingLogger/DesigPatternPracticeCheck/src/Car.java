
public abstract class Car {
CarType model=null;
Location location=null;
public Car(CarType model, Location location) {
	super();
	this.model = model;
	this.location = location;
}
public CarType getModel() {
	return model;
}
public Location getLocation() {
	return location;
}
public void setModel(CarType model) {
	this.model = model;
}
public void setLocation(Location location) {
	this.location = location;
}
abstract void construct();
@Override
public String toString() {
	return "Car [model=" + model + ", location=" + location + "]";
}


}
