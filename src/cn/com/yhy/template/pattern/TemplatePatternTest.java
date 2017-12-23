package cn.com.yhy.template.pattern;

public class TemplatePatternTest {
	public static void main(String[] args) {
		Game game = new Circket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
