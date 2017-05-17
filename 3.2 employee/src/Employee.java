import java.io.Serializable;

public class Employee implements Serializable {
	int empId;
	String empName;
	String grade;
	int count = 0;

	public Employee(int empId, String empName, String grade) {
		this.empId = empId;
		this.empName = empName;
		this.grade = grade;
	}

	int validate(String grade) throws InvalidGradeException {
		if (grade.equals("u1") || grade.equals("u2") || grade.equals("u3")
				|| grade.equals("u4") || grade.equals("p1")
				|| grade.equals("p2")) {
			count++;
			return 1;
		} else
			throw new InvalidGradeException("enter valid grade");

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String toString() {
		return empId + "_" + empName + "_" + grade;

	}

}
