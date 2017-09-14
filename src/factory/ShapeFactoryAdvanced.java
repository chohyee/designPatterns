package factory;
/**
 * ʹ�÷�����ƿ��Խ��ÿ������һ����Ʒʱ��
 * ����Ҫ����һ������ʵ�ֹ�����ȱ��
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
