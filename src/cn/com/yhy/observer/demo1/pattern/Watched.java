package cn.com.yhy.observer.demo1.pattern;

/**
 * @author atlantis0617
 *抽象主题角色  ，Watcher 被观察者
 */
public interface Watched {
	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void notifyWatcher(String str);
}
