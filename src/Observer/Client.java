package Observer;
/**
 * 
 * 
 * 观察者模式
 * 
 * JavaSE 提供了现有的观察者模式
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
    
    public static void main(String[] args) {
		//创建对象
    	COncreteSubject subject=new COncreteSubject();
		//创建观察者
    	ObsererA ob1=new ObsererA();
    	ObsererA ob2=new ObsererA();
    	ObsererA ob3=new ObsererA();
    	
    	//将上面三个观察者添加到目标对象subject的观察者容器中
    	subject.addObserver(ob1);
    	subject.addObserver(ob2);
    	subject.addObserver(ob3);
    	
    	//改变subject对象的状态
    	subject.set(300);
    	
    	System.out.println("******状态修改了");
    	
    	System.out.println(ob1.getMyState());
    	System.out.println(ob2.getMyState());
    	System.out.println(ob3.getMyState());
    	
	}
}
