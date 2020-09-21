
public class LeaveRequest {
private String Employee;
private int leaveDays;
public String getEmployee() {
	return Employee;
}
public void setEmployee(String employee) {
	Employee = employee;
}
public int getLeaveDays() {
	return leaveDays;
}
public void setLeaveDays(int leaveDays) {
	this.leaveDays = leaveDays;
}
public LeaveRequest(String employee, int leaveDays) {
	super();
	Employee = employee;
	this.leaveDays = leaveDays;
}
public LeaveRequest() {
	super();
}
@Override
public String toString() {
	return "LeaveRequest [Employee=" + Employee + ", leaveDays=" + leaveDays + "]";
}

}
