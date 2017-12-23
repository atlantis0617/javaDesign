package cn.com.yhy.decorator.pattern;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("打印圆形的边框颜色");
		circle.draw();
		System.out.println("打印圆形");
		redCircle.draw();
		System.out.println("打印矩形边框颜色");
		redRectangle.draw();
	}
}	
