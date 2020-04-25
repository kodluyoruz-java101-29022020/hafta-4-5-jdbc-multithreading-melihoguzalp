package db.connection.mysql.connection.model;

public class Department implements Comparable<Department> {

	private String name;
	private String deptNo;
	
	public Department(String deptNo, String name) {
		
		this.deptNo = deptNo;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
