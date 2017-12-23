package cn.com.yhy.singleton.pattern;

/**
 * @author atlantis0617
 *	懒汉式线程不安全！！
 *	lazy初始化
 */
public class Singleton {
	private static Singleton instance;
	private Singleton(){};
	
	public Singleton getInstance(){
		if(instance == null){
		 instance = new Singleton();
		}
		return instance;
	}
}
