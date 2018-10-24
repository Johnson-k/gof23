package adapter;


/**
 * 相当于例子中的笔记本，只有USB接口
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {
    public void test1(Target t){
    	
    	t.handlereq();
    }
    public static void main(String[] args) {
		Client client=new Client();//电脑
		Adaptee adaptee=new Adaptee();//键盘
	//	Target target=new AdapteImpl();  //使用继承被适配的方式
		Target target=new AdapteImpl2(adaptee);//组合，传入被适配的对象
		client.test1(target);
	}
}
