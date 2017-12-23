package cn.com.yhy.prototype.pattern;

public class Square extends Shape{
	public Square(){
		type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println("正方形的画方法！！");
	}
	
}
