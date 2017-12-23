package cn.com.yhy.composite.entity.pattern;

public class CompositeEntityPatternTest {
	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}
}
