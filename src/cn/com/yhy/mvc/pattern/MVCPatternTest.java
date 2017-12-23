package cn.com.yhy.mvc.pattern;

public class MVCPatternTest {
	public static void main(String[] args) {
		//从数据可获取学生记录:
		Student model = retriveStudentFromDateBase();
		//创建一个学生视图：
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		
		//更新模型数据:
		model.setName("John");
		controller.updateView();
		
	}

	private static Student retriveStudentFromDateBase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
