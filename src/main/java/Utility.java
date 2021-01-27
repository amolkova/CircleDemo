
public class Utility {
	private Circle circle;

	public Utility() {
		super();
		this.circle = new Circle();
	}
	
	public double earthAndRope(double radius){
		circle.setRadius(radius);
		circle.setFerence(circle.getFerence() + 0.001);
		return circle.getRadius() - radius;
	}
	
	public int calculationOfFence(int radius, int cost){
		circle.setRadius(radius + 1);
		return (int) (circle.getFerence() * cost);
	}
	
	public int calculationOfTrack(int radius, int cost){
		circle.setRadius(radius);
		int arreaInner = (int) circle.getArea();
		circle.setRadius(radius + 1);
		int arreaOut = (int) circle.getArea();
		
		return (arreaOut - arreaInner) * cost;
	}
}


