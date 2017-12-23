package cn.com.yhy.prototype.pattern;

public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}
	@Override
	void draw() {
		System.out.println("圆形的画方法！！");
	}

}
