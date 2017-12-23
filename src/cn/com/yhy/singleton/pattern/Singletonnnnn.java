package cn.com.yhy.singleton.pattern;

/**
 * @author atlantis0617
 *	线程安全
 *	lazy初始化
 */
public class Singletonnnnn {
	private static class SingletonHolder{
		private static final Singletonnnnn INSTANCE = new Singletonnnnn();
	}
	private Singletonnnnn(){};
	public static final Singletonnnnn getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
