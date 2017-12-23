package cn.com.yhy.singleton.pattern;

/**
 * @author atlantis0617
 * 枚举实现单例模式
 * lazy 初始化（否）
 * 线程安全
 */
public enum AnimalHelperSingleton {
	INSTANCE;
	private AnimalHelperSingleton(){};
	
	public String[] buildAnimalList(){
		return null;
	}
	public static void main(String[] args) {
		String [] strs = AnimalHelperSingleton.INSTANCE.buildAnimalList();
		System.out.println(strs);
	}
}
