
public class Start {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(6378.1);
		System.out.println("������� " + circle.getArea());
		System.out.println("����� ���������� " + circle.getFerence());

		circle.setFerence(7);
		System.out.println("������ " + circle.getRadius());
		System.out.println("������� " + circle.getArea());
		
		circle.setArea(8);
		System.out.println("������ " + circle.getRadius());
		System.out.println("����� ���������� " + circle.getFerence());
		
		
		Utility utility = new Utility();
		System.out.println(utility.earthAndRope(6378.1) * 1000);
		
		System.out.println(utility.calculationOfFence(3, 2000));
		System.out.println(utility.calculationOfTrack(3, 1000));
	}


}
