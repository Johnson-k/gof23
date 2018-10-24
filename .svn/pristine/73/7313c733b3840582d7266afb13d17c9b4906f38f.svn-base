package ChainOfResponsibility;

public class GeneralManager extends Leader{

	
    public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void handleRequest(LeaveRequest request) {
    	if(request.getLeaveDays()<30 ){
    		System.out.println("员工"+request.getName()+"请假天数"+request.getLeaveDays());
    	    System.out.println("总经理："+this.name+"审批通过");
    	}else {
			System.out.println("辞职"+request.getName()+request.getLeaveDays());
		}
    	
    }
}
