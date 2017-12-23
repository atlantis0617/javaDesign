package cn.com.yhy.transfer.object.pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	//列表是当作一个数据库：
	public List<StudentVO> students;
	
	public  StudentBO(){
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Robert",0);
		StudentVO student2 = new StudentVO("John",1);
		
		students.add(student1);
		students.add(student2);
	}
	
	public void deleteStudent(StudentVO student){
		students.remove(student.getRoolNo());
		System.out.println("Student : RillNo"+student.getRoolNo()+",deleted from database");
	}
	
	//从数据库中检索学生名单：
	public List<StudentVO> getAllStudents(){
		return students;
	}
	
	public StudentVO getStudent(int rollNo){
		return students.get(rollNo);
	}
	
	public void updateStudent(StudentVO student){
		students.get(student.getRoolNo()).setName(student.getName());
		System.out.println("Studnet Roll No"+student.getRoolNo()+",update in the database");
	}
}
