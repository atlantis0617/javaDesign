package cn.com.yhy.service.locator.pattern;

public class ServiceLocator {
	private static Cache cache;
	static{
		cache = new Cache();
	}
	
	public static Service getService(String jndName){
		Service service = cache.getService(jndName);
		if(service!=null){
			return service;
		}
		InitalContext context = new InitalContext();
		Service service1 = (Service)context.lookup(jndName);
		cache.addService(service1);
		return service1;
	}
	
}
