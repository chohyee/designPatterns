package factory;
/**
 * 使用反射机制可以解决每次增加一个产品时，
 * 都需要增加一个对象实现工厂的缺点
 * @author clover
 *
 */
public class ShapeFactoryAdvanced {
	public static Shape getInstance(Class<?extends Shape> clazz) {
		Shape s = null;
		try {
			s = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return s;
	}
}
