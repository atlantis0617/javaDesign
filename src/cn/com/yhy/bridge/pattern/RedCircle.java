package cn.com.yhy.bridge.pattern;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle color red radius :"+radius+"x : "+x+"y : "+y);
	}

}
