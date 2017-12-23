package cn.com.yhy.factory.pattern;

public class FactoryPatternTest {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		//获取Circle对象并调用其的draw方法
		Shape shape1 = sf.getShape("CIRCLE");
		shape1.draw();
		//获取Square对象并调用其的draw方法
		Shape shape2 = sf.getShape("SQUARE");
		shape2.draw();
		//获取Rectangle对象并调用其的draw方法
		Shape shape3 = sf.getShape("RECTANGLE");
		shape3.draw();
		
	}
}
