
public class Start {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(3);
		System.out.println("������� " + circle.getArea());
		System.out.println("����� ���������� " + circle.getFerence());

		circle.setFerence(7);
		System.out.println("������ " + circle.getRadius());
		System.out.println("������� " + circle.getArea());
		
		circle.setArea(8);
		System.out.println("������ " + circle.getRadius());
		System.out.println("����� ���������� " + circle.getFerence());
	}

}
