package cn.com.yhy.prototype.pattern;

public class Rectangle extends Shape{
	public Rectangle(){
		type = "Rectangle";
	}
	
	@Override
	public void draw() {
		System.out.println("矩形的画方法！");
	}

}
