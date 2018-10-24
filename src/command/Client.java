package command;


/**
 * 命令模式
 * 
 * Recever 接受者
 * Invoker  调用者、请求者
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
   public static void main(String[] args) {
	Command command=new CocreateCommand(new Receiver());
	
	Invoke invoke=new Invoke(command);
	invoke.call();
}
	
}
