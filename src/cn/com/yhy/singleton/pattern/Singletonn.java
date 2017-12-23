package cn.com.yhy.singleton.pattern;

/**
 * @author atlantis0617
 *	懒汉式线程安全
 *lazy初始化
 */
public class Singletonn {
	private static Singletonn instance;
	private Singletonn(){};
	
	public static synchronized Singletonn getInstance(){
		if(instance == null){
			instance = new Singletonn();
		}
		return instance;
	}
}
