package cn.com.yhy.intercepting.filter.pattern;

public class AuthenticationFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("Authenticating Request :"+request);
	}

}
