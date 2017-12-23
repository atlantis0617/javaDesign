package cn.com.yhy.data.access.pattern;

public class DaoPatternTest {
	public static void main(String[] args) {
		StudentDao sd = new StudentDaoImp1();
		
		//输出所有学生：
		for (Student student : sd.getAllStudent()) {
			System.out.println("Student RollNo:"+student.getRollNo()+",Name:"+student.getName());
		}
		
		//更新学生:
		Student stu = sd.getAllStudent().get(0);
		stu.setName("Michael");
		sd.updateStudent(stu);
		
		//获取学生：
		stu = sd.getStudent(0);
		System.out.println("Student RollNo:"+stu.getRollNo()+",Name:"+stu.getName());
	}
}
