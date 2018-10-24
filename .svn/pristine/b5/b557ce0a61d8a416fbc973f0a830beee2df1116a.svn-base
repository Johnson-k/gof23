package ChainOfResponsibility;


/**
 * 定义：将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传播
 * 链上的对象逐个判断是否有能力处理该请求，如果能处理则处理，如果不能则传递给链上的下一个对象
 * 
 * 
 * 
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class ChainOfResponsibility {
     public static void main(String[] args) {
		Leader aLeader=new Director("张三");
		Leader aLeader2=new Manager("李四");
		Leader aLeader3=new GeneralManager("王五");
		
		//组织责任链
		aLeader.setNextLeader(aLeader2);
		aLeader2.setNextLeader(aLeader3);
		
		
		//开始请假操作
		
		LeaveRequest request=new LeaveRequest("tom", 11, "回老家");
		
		//交给主任操作
		aLeader.handleRequest(request);
	}
}
