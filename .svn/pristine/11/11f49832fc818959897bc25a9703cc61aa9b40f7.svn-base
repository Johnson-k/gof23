package ChainOfResponsibility;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//责任链上的构造对象
    public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	public Leader(String name) {
		super();
		this.name=name;
	}
	
	//处理请求的核心类方法
	public abstract void handleRequest(LeaveRequest request);
}
