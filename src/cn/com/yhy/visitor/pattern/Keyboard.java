package cn.com.yhy.visitor.pattern;

public class Keyboard implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
	
}
