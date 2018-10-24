package ChainOfResponsibility;

public class Manager extends Leader{

	
    public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void handleRequest(LeaveRequest request) {
    	if(request.getLeaveDays()<10 ){
    		System.out.println("员工"+request.getName()+"请假天数"+request.getLeaveDays());
    	    System.out.println("经理："+this.name+"审批通过");
    	}else {
			if (this.nextLeader!=null) {
				System.out.println("***********这事"+name+"处理不了，交给"+this.nextLeader.name+"处理");
				this.nextLeader.handleRequest(request);
				
			}
		}
    	
    }
}
