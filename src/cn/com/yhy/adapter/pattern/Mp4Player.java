package cn.com.yhy.adapter.pattern;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		//doNothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing file name : "+fileName);
	}

}
