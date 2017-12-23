package cn.com.yhy.transfer.object.pattern;

public class TransferObjectPatternTest {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		
		//输出所有学生：
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student : RollNo:" +student.getRoolNo()+"Name : "+student.getName());
		}
		//更新学生：
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);
		
		//获取学生：
		studentBusinessObject.getStudent(0);
		System.out.println("Student : RollNo:" +student.getRoolNo()+"Name : "+student.getName());
		
	}
}
