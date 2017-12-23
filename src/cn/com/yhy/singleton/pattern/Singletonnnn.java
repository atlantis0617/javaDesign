package cn.com.yhy.singleton.pattern;

/**
 * @author atlantis0617
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * lazy初始化
 * 线程安全
 */
public class Singletonnnn {
	private volatile static Singletonnnn instance;
	private Singletonnnn(){};
	public static Singletonnnn getInstance(){
		if(instance == null){
			synchronized (Singletonnnn.class){
				instance = new Singletonnnn();
			}
		}
		return instance;
	}
}
