package cn.com.yhy.intercepting.filter.pattern;

public class Target {
	public void execute(String request){
		System.out.println("Executing Request : "+request);
	}
}
