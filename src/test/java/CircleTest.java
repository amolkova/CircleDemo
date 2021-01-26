import org.junit.Test;

import junit.framework.Assert;

public class CircleTest {

		@SuppressWarnings("deprecation")
		@Test
		public void setRadiusTestPositive(){
			
			Circle circle = new Circle();
			circle.setRadius(3);
			System.out.println("Площадь " + circle.getArea());
			System.out.println("Длина окружности " + circle.getFerence());
			

			Assert.assertEquals(28.2, circle.getArea(), 0.1);
			Assert.assertEquals(18.8, circle.getFerence(), 0.1);

		}
		
		@SuppressWarnings("deprecation")
		@Test
		public void setFerenceTestPositive(){
			
			Circle circle = new Circle();
			circle.setFerence(18.8);

			Assert.assertEquals(3, circle.getRadius(), 0.1);
			Assert.assertEquals(28.2, circle.getArea(), 0.1);

		}
		
		@SuppressWarnings("deprecation")
		@Test
		public void setAreaTestPositive(){
			
			Circle circle = new Circle();
			circle.setArea(28.2);

			Assert.assertEquals(3, circle.getRadius(), 0.1);
			Assert.assertEquals(18.8, circle.getFerence(), 0.1);

		}
}
