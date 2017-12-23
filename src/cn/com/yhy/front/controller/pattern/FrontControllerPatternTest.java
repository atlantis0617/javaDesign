package cn.com.yhy.front.controller.pattern;

public class FrontControllerPatternTest {
	public static void main(String[] args) {
		FrontContorller frontController = new FrontContorller();
		frontController.dispatchRequest("Home");
		frontController.dispatchRequest("Student");
	}
}
