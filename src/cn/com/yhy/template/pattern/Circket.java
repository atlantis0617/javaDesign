package cn.com.yhy.template.pattern;

public class Circket extends Game{

	@Override
	void initialize() {
		 System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		 System.out.println("Cricket Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}
	
}
