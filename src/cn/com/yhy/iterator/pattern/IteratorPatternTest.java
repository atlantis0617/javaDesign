package cn.com.yhy.iterator.pattern;

public class IteratorPatternTest {
	public static void main(String[] args) {
		NameReponsitory nameReponsitory = new NameReponsitory();
		for (Iterator iter = nameReponsitory.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("name : "+name);
		}
	}
}
