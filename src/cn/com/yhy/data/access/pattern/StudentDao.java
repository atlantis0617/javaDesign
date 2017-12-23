package cn.com.yhy.data.access.pattern;

import java.util.List;

public interface StudentDao {
	public List<Student> getAllStudent();
	
	public Student getStudent(int rollNo);
	
	public void updateStudent(Student stu);
	
	public void deleteStudent(Student stu);
}
