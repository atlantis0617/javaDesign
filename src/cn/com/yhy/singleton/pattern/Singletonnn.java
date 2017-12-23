package cn.com.yhy.singleton.pattern;

/**
 * @author atlantis0617
 *	饿汉式
 *	lazy初始化（否）
 *	线程安全
 */
public class Singletonnn {
	private static Singletonnn instance = new Singletonnn();
	private Singletonnn(){};
	public static Singletonnn getInstance(){
		return instance;
	}
}
