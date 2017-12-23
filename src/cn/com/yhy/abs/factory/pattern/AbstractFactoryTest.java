package cn.com.yhy.abs.factory.pattern;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//获取圆形对象
		Shape circle = shapeFactory.getShape("CIRCLE");
		//调用圆形的画方法
		circle.draw();
		//获取正方形对象
		Shape square = shapeFactory.getShape("SQUARE");
		//调用正方形的画方法
		square.draw();
		//获取矩形对象
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		//调用矩形的画方法
		rectangle.draw();
		
		//获取颜色工厂对象
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//获取红色
		Color red = colorFactory.getColor("RED");
		//调用填充方法
		red.fill();
		//获取绿色
		Color green = colorFactory.getColor("GREEN");
		//调用填充方法
		green.fill();
		//获取蓝色
		Color blue = colorFactory.getColor("BLUE");
		//调用填充方法
		blue.fill();
		
	}
}
