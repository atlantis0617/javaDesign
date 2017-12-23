package cn.com.yhy.front.controller.pattern;

public class FrontContorller {
	private Dispatcher dispatcher;
	
	public FrontContorller(){
		dispatcher = new Dispatcher();
	}
	private boolean isAuthenticUser(){
		System.out.println("User is authenticated successfully");
		return true;
	}
	
	private void trackRequest(String request){
		System.out.println("Page requested :" +request);
	}
	
	public void dispatchRequest(String request){
		//记录每一个请求：
		trackRequest(request);
		//对用户进行身份验证：
		if(isAuthenticUser()){
			dispatcher.dispatcher(request);
		}
	}
	
	
	
	public Dispatcher getDispatcher() {
		return dispatcher;
	}
	public void setDispatcher(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}
}
