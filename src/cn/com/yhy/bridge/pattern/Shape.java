package cn.com.yhy.bridge.pattern;

public abstract class Shape {
	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
