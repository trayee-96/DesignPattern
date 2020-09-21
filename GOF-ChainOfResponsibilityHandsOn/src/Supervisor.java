
public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	public Supervisor(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 3)
			System.out.println("leave approved by supervisor for " + leaveRequest);
		else
			nextHandler.HandleRequest(leaveRequest);
	}

}
