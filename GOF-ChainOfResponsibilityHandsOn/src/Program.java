
public class Program {

	
public static ILeaveRequestHandler getChainOfILeaveRequestHandlers() {
	ILeaveRequestHandler hr=new HR();
	ILeaveRequestHandler projectmanager=new ProjectManager(hr);
	ILeaveRequestHandler supervisor=new Supervisor(projectmanager);
	return supervisor;
	
}
public static void main(String[] args) {
	LeaveRequest request1 = new LeaveRequest("Mr. Rana", 1);
	LeaveRequest request2 = new LeaveRequest("Mr. Sarbesh", 2);
	LeaveRequest request3 = new LeaveRequest("Mr. Sikta", 3);
	LeaveRequest request4 = new LeaveRequest("Ms. Anindita", 4);
	LeaveRequest request5 = new LeaveRequest("Mr. Anil", 5);
	LeaveRequest request6 = new LeaveRequest("Ms. Disha", 6);
	ILeaveRequestHandler handler = getChainOfILeaveRequestHandlers();
	handler.HandleRequest(request1);
	handler.HandleRequest(request2);
	handler.HandleRequest(request3);
	handler.HandleRequest(request4);
	handler.HandleRequest(request5);
	handler.HandleRequest(request6);

	}


}
