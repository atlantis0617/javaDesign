package cn.com.yhy.flyweight.pattern;

public class FlyWeightPatterTest {
	private static final String colors[] = {"Red","Green","Blue","White","Black"};
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setRadius(100);
			circle.setX(getRandomX());
			circle.setY(getRandomY());
		}
	}
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
}
