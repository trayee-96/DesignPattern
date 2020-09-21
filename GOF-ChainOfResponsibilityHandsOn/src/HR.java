
public class HR implements ILeaveRequestHandler{
private ILeaveRequestHandler nextHandler;

	public HR(ILeaveRequestHandler nextHandler) {
	super();
	this.nextHandler = nextHandler;
}
	

	public HR() {
		super();
	}


	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		System.out.println("Leave approved by HR "+leaveRequest);
	}

}
