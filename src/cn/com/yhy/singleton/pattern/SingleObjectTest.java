package cn.com.yhy.singleton.pattern;

public class SingleObjectTest {
	public static void main(String[] args) {
		SingleObject so = SingleObject.getInstance();
		so.showMessage();
	}
}
