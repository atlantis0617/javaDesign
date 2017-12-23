package cn.com.yhy.data.access.pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp1 implements StudentDao{
	//列表是当作一个数据库
	List<Student> students;
	
	public StudentDaoImp1(){
		students = new ArrayList<Student>();
		Student stu1 = new Student("Robert",0);
		Student stu2 = new Student("John",1);
		students.add(stu1);
		students.add(stu2);
	}

	@Override
	public List<Student> getAllStudent() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student stu) {
		students.get(stu.getRollNo()).setName(stu.getName());
		System.out.println("Student :RollNo	"+stu.getRollNo()+",updated in the databases");
		
	}

	@Override
	public void deleteStudent(Student stu) {
		students.remove(stu.getRollNo());
		System.out.println("Student :RollNo	"+stu.getRollNo()+",delete in the databases");
	}

}
