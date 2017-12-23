package cn.com.yhy.proxy.pattern;

public class ProxyPatternTest {
	public static void main(String[] args) {
		Image img = new ProxyImage("test.jpg");
		
		//图像将从磁盘加载
		img.display();
		System.out.println("");
		//图像将无法从磁盘加载
		img.display();
	}
}
