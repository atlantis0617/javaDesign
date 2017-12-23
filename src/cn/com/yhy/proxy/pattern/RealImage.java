package cn.com.yhy.proxy.pattern;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);	
	}
	private void loadFromDisk(String fileName) {
		System.out.println("加载："+fileName);
	}
	@Override
	public void display() {
		System.out.println("显示："+fileName);
	}

}
