package cn.com.yhy.front.controller.pattern;

public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;
	
	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void  dispatcher(String request){
		if(request.equalsIgnoreCase("STUDENT")){
			studentView.show();
		}else{
			homeView.show();
		}
	}
}
