package new_expt;

import java.io.Serializable;

public class Employee implements Serializable{
	@Override
	public boolean equals(Object obj) {
		Employee e1=(Employee)obj;
		
		if(this.getEmpName().equals(e1.getEmpName() ) )
						if(this.getEmpId()==e1.getEmpId())
									return true;
		
							return false;
		
	}
	
	private  int empId;
	private int empSalary;
	private  String  empName;
	public Employee(int empId, int empSalary, String empName) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSalary=" + empSalary
				+ ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	    

}
