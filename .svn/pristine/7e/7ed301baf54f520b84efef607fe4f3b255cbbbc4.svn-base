package command;

public interface Command {
	
	/**
	 * 这个方法是一个返回结果为空的方法
	 * 实际项目中可以根据需求设计多个不同的方法
	 */
    void execute();
}
class CocreateCommand implements Command{
    private Receiver receiver;//命令真正的执行者
    
    
	public CocreateCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		//命令真正执行前后可以加的操作
		System.out.println("接到命令");
		
		
		receiver.action();
		
	}
	
}