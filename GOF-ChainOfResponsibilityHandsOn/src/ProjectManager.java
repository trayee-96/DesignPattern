
public class ProjectManager implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	public ProjectManager() {
		super();
	}

	public ProjectManager(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 5)
			System.out.println("leave approved by ProjectManager for " + leaveRequest);
		else
			nextHandler.HandleRequest(leaveRequest);
	}

}
