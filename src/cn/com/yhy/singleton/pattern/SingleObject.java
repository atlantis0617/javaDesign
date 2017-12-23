package cn.com.yhy.singleton.pattern;

public class SingleObject {
	//创建 singleObject的一个对象
	private static SingleObject instance = new SingleObject();
	
	//私有化构造方法
	private SingleObject(){};
	
	//获取唯一可用对象:
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello World!");
	}
}
