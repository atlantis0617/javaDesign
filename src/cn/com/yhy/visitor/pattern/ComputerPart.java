package cn.com.yhy.visitor.pattern;

public interface  ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
