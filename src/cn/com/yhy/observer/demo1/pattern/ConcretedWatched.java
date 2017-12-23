package cn.com.yhy.observer.demo1.pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcretedWatched implements Watched{
	//存放观察者：
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatcher(String str) {
		for (Watcher watcher : list) {
			watcher.update(str);
		}
	}

}
