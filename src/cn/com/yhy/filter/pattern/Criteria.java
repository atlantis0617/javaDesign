package cn.com.yhy.filter.pattern;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
