
package factory;

public class FactoryPatternAdvancedDemo {
	public static void main(String[] args) {
		Circle circle = (Circle) ShapeFactoryAdvanced.getInstance(Circle.class);
		circle.draw();
		Rectangle rec = (Rectangle) ShapeFactoryAdvanced.getInstance(Rectangle.class);
		rec.draw();
		Square squ = (Square) ShapeFactoryAdvanced.getInstance(Square.class);
		squ.draw();
	}
}
