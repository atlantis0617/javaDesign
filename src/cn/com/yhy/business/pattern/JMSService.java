package cn.com.yhy.business.pattern;

public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("processing task by invoking JMS Service");
	}

}
