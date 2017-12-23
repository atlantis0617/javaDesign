package cn.com.yhy.prototype.pattern;

public abstract class Shape implements Cloneable{
	private String id;
	/**受保护的类型*/
	protected String type;
	
	abstract void draw();
	
	@Override
	protected Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

}
