package cn.com.yhy.visitor.pattern;

public class VisitorPatternTest {
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
