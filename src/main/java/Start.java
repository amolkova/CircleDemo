
public class Start {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(3);
		System.out.println("Площадь " + circle.getArea());
		System.out.println("Длина окружности " + circle.getFerence());

		circle.setFerence(7);
		System.out.println("Радиус " + circle.getRadius());
		System.out.println("Площадь " + circle.getArea());
		
		circle.setArea(8);
		System.out.println("Радиус " + circle.getRadius());
		System.out.println("Длина окружности " + circle.getFerence());
	}

}
